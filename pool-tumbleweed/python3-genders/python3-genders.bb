SUMMARY = "Python bindings for genders"
DESCRIPTION = "Necessary files for using genders with Python."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "python3-genders-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "b4cc359f28e850eaddbe14f79db4cddef09915bff35af41798d33e20277cd4a892d6458a7dfadd72233f0df9187e0b5f11d7b63a24a94e65f8c9992b6b21d518"

RPROVIDES:${PN} += "libgenders.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-genders \
python3-genders(aarch-64) \
python3.10dist(libgenders) \
python3dist(libgenders)"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgenders.so.0()(64bit) \
python(abi)"

inherit rpm
