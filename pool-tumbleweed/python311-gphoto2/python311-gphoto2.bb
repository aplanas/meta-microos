SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python311-gphoto2-2.2.4-3.5.aarch64.rpm"
RPM_HASH = "2fd42eac28ecf74f80dc31df75846466aff8dcb3f06a3ceb5b992e28649e20760434fd2ccf647820022956e63400d84d39e6e46c41fe7aac620d015728df6891"

RPROVIDES:${PN} += "python3-gphoto2 \
python3.11dist-gphoto2 \
python311-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
