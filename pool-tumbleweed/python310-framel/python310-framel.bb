SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python310-framel-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "5cc82964ff20329c292414358f68cd66e92443ad264a7f4f606ddc9df10d3d5f4de5e4ca751799b28846462f11c2c9f70f9bba4dd3757da5670fcfc217ab919e"

RPROVIDES:${PN} += "python3-framel \
python3.10dist(framel) \
python310-framel \
python310-framel(aarch-64) \
python3dist(framel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libframel.so.8()(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi)"

inherit rpm
