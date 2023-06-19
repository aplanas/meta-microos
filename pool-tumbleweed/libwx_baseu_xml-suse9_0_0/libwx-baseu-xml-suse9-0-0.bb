SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_xml-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "395ca7c76bc1147db31d56a056c87eae01e0fb20e30fda97f635bc06b9d7af28478e4d759e4473abd50cb0e95fb48e363956c7eee558d8ac2ca1c97b5601b8da"

RPROVIDES:${PN} += "libwx-baseu-xml-suse.so.9.0.0 \
libwx-baseu-xml-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0"

inherit rpm
