SUMMARY = "Development files for mcpp"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the development files for libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "mcpp-devel-2.7.2-24.15.aarch64.rpm"
RPM_HASH = "c74c3c7702d3ef9e18f927682be61453f7474d567ccc0eb929a5d14eb9de75fa0aa620bbcfedc7e405451fc14091d2f0cece5e8367774a19be8828698a8171e9"

RPROVIDES:${PN} += "mcpp-devel"

RDEPENDS:${PN} += "libmcpp0 \
mcpp"

inherit rpm
