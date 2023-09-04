SUMMARY = "Documentation for texlive-identkey"
DESCRIPTION = "This package includes the documentation for texlive-identkey"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-doc-2023.209.0.0.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "c15780756d122728f9d01ca6662dce5f8d1b2605ad800da526c33d7b9915e9a3f8f33e5b1eb5b2876af24e0d9dd85e97b4eea4dc11a62746da47bcac904b6cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-identkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
