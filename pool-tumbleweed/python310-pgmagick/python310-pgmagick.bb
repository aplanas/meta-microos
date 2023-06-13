SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-pgmagick-0.7.4-3.25.aarch64.rpm"
RPM_HASH = "c87a3f07e10bc77c9081bcf57b5a9a6ee509c13b5aa0fe7737ceeccd0ae266de4beae6cb044e52fb5993747a2f46b3d7b7433608997bcc04c1b0284b6447cda7"

RPROVIDES:${PN} += "python3-pgmagick \
python3.10dist(pgmagick) \
python310-pgmagick \
python310-pgmagick(aarch-64) \
python3dist(pgmagick)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGraphicsMagick++-Q16.so.12()(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi)"

inherit rpm
