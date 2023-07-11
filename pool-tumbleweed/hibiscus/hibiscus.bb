SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "A free Java homebanking application that uses the HBCI4Java implementation \
and runs as a plugin inside the Jameica framework. Support chipcards \
key files and PIN/TAN including chipTAN and smsTAN for authentification. \
Supported file formats include MT940, DTAUS, CSV, Moneyplex and PDF/HTML."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.8"

RPM_NAME = "hibiscus-2.10.8-1.3.aarch64.rpm"
RPM_HASH = "b1f0afbf6c519489b02f34c47909064b612f2fd2b7f405760f9bff38684e4d113d8551bc2f45bfd01804360dc99376c0693e5b19a486b202496fd17f6966d27c"

RPROVIDES:${PN} += "hibiscus"

RDEPENDS:${PN} += "eclipse-swtchart \
hbci4java \
itextpdf \
jameica \
pcsc-towitoko-devel \
super-csv"

inherit rpm
