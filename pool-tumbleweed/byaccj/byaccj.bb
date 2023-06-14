SUMMARY = "Parser Generator with Java Extension"
DESCRIPTION = "BYACC/J is an extension of the Berkeley v 1.8 YACC-compatible parser \
generator. Standard YACC takes a YACC source file, and generates one or \
more C files from it, which if compiled properly, will produce a \
LALR-grammar parser. This is useful for expression parsing, interactive \
command parsing, and file reading. Many megabytes of YACC code have \
been written over the years. This is the standard YACC tool that is in \
use every day to produce C/C++ parsers. I have added a '-J' flag which \
will cause BYACC to generate Java source code, instead. So there \
finally is a YACC for Java now!"
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "byaccj-1.15-2.7.aarch64.rpm"
RPM_HASH = "48e121be4ffd5046e6de308d10ab3936a568e6473c776c30d338674bef3762243b72f5543df66980731f73e71efd99f86e4e6a6f06147e7cee2b57a7debdda44"

RPROVIDES:${PN} += "byaccj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
man-pages"

inherit rpm
