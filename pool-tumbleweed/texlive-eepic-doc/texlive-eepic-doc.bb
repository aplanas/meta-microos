SUMMARY = "Documentation for texlive-eepic"
DESCRIPTION = "This package includes the documentation for texlive-eepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1esvn15878"

RPM_NAME = "texlive-eepic-doc-2023.209.1.1esvn15878-54.1.noarch.rpm"
RPM_HASH = "517d5a31503ebdebb7fcd9b5c8325d4f11a0c53f77dd400778b57e22b7306d4c242b4dd0780c802850186520e6dc4bda0f07ff162ac246339bf17f2f637fa51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eepic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
