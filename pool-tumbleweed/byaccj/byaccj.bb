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

RPM_NAME = "byaccj-1.15-2.8.aarch64.rpm"
RPM_HASH = "fd0980ed01327701280bc91f777fba819254b36b5a9046c130d013e7ed40aaacbc1cbd5b8b6ebeb2392c5217c4babba488fb0dd63c7a0dcdf370b37e91e8a159"

RPROVIDES:${PN} += "byaccj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
man-pages"

inherit rpm
