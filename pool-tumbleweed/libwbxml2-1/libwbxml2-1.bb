SUMMARY = "WBXML parser and compiler library"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents. The WBXML format is a binary \
representation of XML defined by the Wap Forum."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.8"

RPM_NAME = "libwbxml2-1-0.11.8-1.2.aarch64.rpm"
RPM_HASH = "8a640eb4780f6df5349875c97c6efbbeb1ab9fecca095ef7441f057885aa046f1f1c9490d544c4ba5e345d248decfd895e2dcdcf77f3b41f2eb5ad96aa70c6ee"

RPROVIDES:${PN} += "libwbxml2-1 \
libwbxml2-1(aarch-64) \
libwbxml2.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
