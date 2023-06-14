SUMMARY = "Translations for package epour"
DESCRIPTION = "Provides translations for the 'epour' package."
LICENSE = "GPL-3.0"

PV = "0.7.0"

RPM_NAME = "epour-lang-0.7.0-1.17.noarch.rpm"
RPM_HASH = "e1c85d6e403527abaf669f21ad25760d6c0e7be4f10c80e21223d85205bd86c5f9b8a065798ecee36f71f6c077be35576197797a64c134d1d3e9b1a90a68cbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epour-lang \
epour-lang-all \
locale-epour-ko"

RDEPENDS:${PN} += "epour"

inherit rpm
