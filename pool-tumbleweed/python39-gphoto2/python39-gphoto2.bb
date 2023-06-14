SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python39-gphoto2-2.2.4-3.3.aarch64.rpm"
RPM_HASH = "9e052c0d9e7da38aceae16dccf7a816828bdca9412febe449c08eb7bcbe58803e4dc8911fda6747a45a4422c9723b1accc1d4a99e3042e7fdf005591053a5cd8"

RPROVIDES:${PN} += "python3.9dist-gphoto2 \
python39-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
