SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-pgmagick-0.7.4-3.25.aarch64.rpm"
RPM_HASH = "2423ab60476027256d0fba73827f640a570697f9c67830b18ee85811a3ce8e29b351b14850e4272b8744a7bc30dc9880604c67e8132999b57256241288fe55ab"

RPROVIDES:${PN} += "python3.9dist(pgmagick) \
python39-pgmagick \
python39-pgmagick(aarch-64) \
python3dist(pgmagick)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGraphicsMagick++-Q16.so.12()(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
