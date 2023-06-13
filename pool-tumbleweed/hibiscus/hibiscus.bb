SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "A free Java homebanking application that uses the HBCI4Java implementation \
and runs as a plugin inside the Jameica framework. Support chipcards \
key files and PIN/TAN including chipTAN and smsTAN for authentification. \
Supported file formats include MT940, DTAUS, CSV, Moneyplex and PDF/HTML."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.8"

RPM_NAME = "hibiscus-2.10.8-1.2.aarch64.rpm"
RPM_HASH = "3b8ae87c29454eea0ee4ab13cf4f1999a384149bee48a6add7136cb44db86e155dc48c750914689fcfc34c2c53633743253d8d36c745c2fda33fc6d9e8762807"

RPROVIDES:${PN} += "application() \
application(hibiscus.desktop) \
hibiscus \
hibiscus(aarch-64) \
metainfo() \
metainfo(hibiscus.appdata.xml)"

RDEPENDS:${PN} += "eclipse-swtchart \
hbci4java \
itextpdf \
jameica \
pcsc-towitoko-devel \
super-csv"

inherit rpm
