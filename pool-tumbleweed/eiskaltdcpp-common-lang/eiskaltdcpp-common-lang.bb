SUMMARY = "Translations for package eiskaltdcpp-common"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-lang-2.4.2-1.13.noarch.rpm"
RPM_HASH = "a2318ab4cc2ac456bfb37d160a953273718371d0d125e5dbf1a17ef790543099682d8812d369da8c061e24145ca1a4c5d71a4dc27ea40f676f6075310e52759e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common-lang \
eiskaltdcpp-common-lang-all \
locale(eiskaltdcpp-common:be) \
locale(eiskaltdcpp-common:bg) \
locale(eiskaltdcpp-common:cs) \
locale(eiskaltdcpp-common:da) \
locale(eiskaltdcpp-common:de) \
locale(eiskaltdcpp-common:el) \
locale(eiskaltdcpp-common:en) \
locale(eiskaltdcpp-common:es) \
locale(eiskaltdcpp-common:eu) \
locale(eiskaltdcpp-common:fr) \
locale(eiskaltdcpp-common:hu) \
locale(eiskaltdcpp-common:it) \
locale(eiskaltdcpp-common:pl) \
locale(eiskaltdcpp-common:pt_BR) \
locale(eiskaltdcpp-common:ru) \
locale(eiskaltdcpp-common:sk) \
locale(eiskaltdcpp-common:sr) \
locale(eiskaltdcpp-common:sr@latin) \
locale(eiskaltdcpp-common:tr) \
locale(eiskaltdcpp-common:uk) \
locale(eiskaltdcpp-common:vi) \
locale(eiskaltdcpp-common:zh_CN)"
RDEPENDS:${PN} += "eiskaltdcpp-common"

inherit rpm
