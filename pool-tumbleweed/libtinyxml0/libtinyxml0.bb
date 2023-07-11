SUMMARY = "A simple, small, C++ XML parser"
DESCRIPTION = "TinyXML is a simple, small, C++ XML parser that can be easily integrating \
into other programs. Have you ever found yourself writing a text file parser \
every time you needed to save human readable data or serialize objects? \
TinyXML solves the text I/O file once and for all. \
(Or, as a friend said, ends the Just Another Text File Parser problem.)"
LICENSE = "Zlib"

PV = "2.6.2"

RPM_NAME = "libtinyxml0-2.6.2-10.9.aarch64.rpm"
RPM_HASH = "c8e8248723eac29ab0807113920d535f39a65eee5f24bd2cf59ef8d41a356932b9aa7e6bf90df6c9659a350561b2b03e4351e8bf7fc812f44b54971070af17ce"

RPROVIDES:${PN} += "libtinyxml.so.0 \
libtinyxml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
