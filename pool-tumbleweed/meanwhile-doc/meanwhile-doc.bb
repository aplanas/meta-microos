SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-doc-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "cc855d1c61e3b2b444f843caad6757cb536fd7eca69e3b551088bd599bae0f626bb823285ac12b280f33ae76ea3686fd82f5844afe938e3ff34fa1d8822035d8"

RPROVIDES:${PN} += "meanwhile-doc"

RDEPENDS:${PN} += ""

inherit rpm
