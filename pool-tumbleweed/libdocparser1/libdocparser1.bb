SUMMARY = "A document parser library"
DESCRIPTION = "docparser is a document parser library.It is ported from document2html."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "libdocparser1-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "315e22e5a275dec36eadd1accb23c7b988f10cd6230c69026bf6e129bac212099ac36e291a0c51dfc7d379c4d8cd6709432dcced5c08eae54ed97af0fb142ab2"

RPROVIDES:${PN} += "libdocparser.so.1 \
libdocparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-cpp.so.0 \
libstdc++.so.6"

inherit rpm
