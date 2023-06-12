SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "tesseract-ocr-5.3.0-3.4.aarch64.rpm"
RPM_HASH = "2d49e7132115d1d5cbaf92d005fae83639f723c8fe9e0ebe9eb9ee6c753f50628ed36d52b0cfac4dff71e7596ab14d308d297defcbaabfe8b603f11991e1807a"

RPROVIDES:${PN} += "libcommon_training.so()(64bit) \
libpango_training.so()(64bit) \
libunicharset_training.so()(64bit) \
tesseract-ocr \
tesseract-ocr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libleptonica.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtesseract.so.5.3.0()(64bit)"

inherit rpm
