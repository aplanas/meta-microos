SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python310-gphoto2-2.2.4-3.3.aarch64.rpm"
RPM_HASH = "8d6cc92e835c8c1977b82722731249f8dad52529bae67497f642e5602d987cb21db20e39e94617d258eba104cb35df0cd0b7cf89430f96d43261a458038c0c76"

RPROVIDES:${PN} += "python3-gphoto2 \
python3.10dist(gphoto2) \
python310-gphoto2 \
python310-gphoto2(aarch-64) \
python3dist(gphoto2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
python(abi)"

inherit rpm
