SUMMARY = "Themes for the MATE desktop"
DESCRIPTION = "Official themes for the MATE desktop \
 \
This package contains the official desktop themes of the MATE \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.23"

RPM_NAME = "mate-themes-3.22.23-1.4.noarch.rpm"
RPM_HASH = "e5e1c3f73d261e408873c78526adcd647dc0d2cd121a9ed9d0c746be3a63cae5bf2cd54db362ecb19ce5b0c35dea630ab011e727b34502347a9f7d4e01f9028e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-themes"

RDEPENDS:${PN} += "gtk2-engine-clearlooks \
gtk2-engine-hcengine \
gtk2-engine-murrine"

inherit rpm
