SUMMARY = "Source Code Measure Counter for C/C++/Java"
DESCRIPTION = "c_count counts lines, statements, and other simple measures of C/C++/Java \
source programs. It is not lex/yacc based, and is easily portable to a \
variety of systems."
LICENSE = "MIT"

PV = "7.20"

RPM_NAME = "c_count-7.20-1.8.aarch64.rpm"
RPM_HASH = "cc0822c12f5b74a3b1dda34c9d4dad66675f2a74ae5e9ab2d5ccacb192e332bf1a6f7cebbd5274af990f81cd0e7abd4ca2c7eff703501725a6a067d706c2aa32"

RPROVIDES:${PN} += "c_count \
c_count(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
