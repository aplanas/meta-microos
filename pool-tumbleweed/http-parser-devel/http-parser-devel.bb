SUMMARY = "Development headers and libraries for http-parser"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection). \
 \
Development headers and libraries for http-parser."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "http-parser-devel-2.9.4-1.12.aarch64.rpm"
RPM_HASH = "62c7a0ce3dee6b8f5fe887acb916ee3eb406952317fae24e0b38ff18f2f0886a5bda53f13609240d16d03cf9397b102c58ce70d663bbbd07ea2309851d03c979"

RPROVIDES:${PN} += "http-parser-devel"

RDEPENDS:${PN} += "libhttp-parser2-9"

inherit rpm
