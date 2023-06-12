SUMMARY = "Translations for package liblxqt"
DESCRIPTION = "Provides translations for the 'liblxqt' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "840d8f496849766aeabddb89a70746d3871c5acb7439e2e67eda5646508031a064fadabf02c2b5b98af956f9990aa62110f8364f714b6f18a27f9e7785ba5f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblxqt-lang \
liblxqt-lang-all"
RDEPENDS:${PN} += "liblxqt"

inherit rpm
