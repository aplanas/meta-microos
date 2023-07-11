SUMMARY = "Documentation for texlive-eepic"
DESCRIPTION = "This package includes the documentation for texlive-eepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1esvn15878"

RPM_NAME = "texlive-eepic-doc-2023.201.1.1esvn15878-53.2.noarch.rpm"
RPM_HASH = "7cb473c71243edffaba320bd24a18c486b54cf998fe0f0827fc2d07384cd35080c41b8e0e86ba525c76debad816d38a6bbcf2b5a24dd9d8103553444c9c0f091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eepic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
