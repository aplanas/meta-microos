SUMMARY = "Source Code Measure Counter for C/C++/Java"
DESCRIPTION = "c_count counts lines, statements, and other simple measures of C/C++/Java \
source programs. It is not lex/yacc based, and is easily portable to a \
variety of systems."
LICENSE = "MIT"

PV = "7.22"

RPM_NAME = "c_count-7.22-1.1.aarch64.rpm"
RPM_HASH = "fc7337b93bb41b1a311d99b7d3fa85c7c2c7441326876adec72dadd8c75b16c50364bd11b954833e2642deff168b459149630b4daca4f4806e8695921408ce96"

RPROVIDES:${PN} += "c-count"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
