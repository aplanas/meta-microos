SUMMARY = "Documentation for gnuradio-osmosdr"
DESCRIPTION = "Documentation for gr-osmosdr module for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-doc-0.2.4-1.2.noarch.rpm"
RPM_HASH = "1b1a9e87588899fd395535827997609204c46248d95c4b65658d42725f752f69e82b492fd217eba0cb48c5b3f3271d31c4e76ab6428d86664a8716a12d7e7d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-osmosdr-doc"

RDEPENDS:${PN} += "gr-osmosdr"

inherit rpm
