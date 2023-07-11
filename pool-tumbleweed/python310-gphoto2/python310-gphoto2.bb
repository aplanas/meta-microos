SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python310-gphoto2-2.2.4-3.5.aarch64.rpm"
RPM_HASH = "06fc303943fc9ab164ec7e66cb0b0d71729daa03c45b0b96191fe9c3dc4e5827b19157130672c81a2cf21f04103d87b3c7ac01d635c8ba02b2ba72c00a1b6243"

RPROVIDES:${PN} += "python3.10dist-gphoto2 \
python310-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
