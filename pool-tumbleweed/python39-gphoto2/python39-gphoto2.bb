SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python39-gphoto2-2.2.4-3.5.aarch64.rpm"
RPM_HASH = "801a4a5c0e8ae9f1e343cc2a23fc93db17c1e8e1a53af115d4442f367fab77f720547eba2788f8a30ff8c581d9740f134369ef75c2202c97e6eda7ebe8ac6073"

RPROVIDES:${PN} += "python3.9dist-gphoto2 \
python39-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
