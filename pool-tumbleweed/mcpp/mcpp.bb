SUMMARY = "Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "mcpp-2.7.2-24.15.aarch64.rpm"
RPM_HASH = "6832a92f5de41b9fe3925e1f1f55cf24214ecaa83956bf62fa4b2433e2044db238051e4dbbbfafb273ebe6027ab049578fa87158167bfdf8c9317727218cae0c"

RPROVIDES:${PN} += "mcpp"

RDEPENDS:${PN} += "libc.so.6 \
libmcpp.so.0"

inherit rpm
