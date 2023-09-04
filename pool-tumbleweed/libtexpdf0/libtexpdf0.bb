SUMMARY = "A PDF library extracted from TeX's dvipdfmx"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the shared library for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.11"

RPM_NAME = "libtexpdf0-0.14.11-1.1.aarch64.rpm"
RPM_HASH = "b9792afe780d17ef308831ef2f801e96050d9ff153e8c4d37ff099f364a10ec9e26d14ef2ec90990705a0dd5792594322e1af6704a3388aaf9959e583de74dc2"

RPROVIDES:${PN} += "libtexpdf.so.0 \
libtexpdf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
