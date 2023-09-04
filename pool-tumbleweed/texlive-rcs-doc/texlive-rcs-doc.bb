SUMMARY = "Documentation for texlive-rcs"
DESCRIPTION = "This package includes the documentation for texlive-rcs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rcs-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "f5750628633277e184b5a8ef1bc7df85c9592a0b90899cc640cb3f387717bb09833bc9d141e21cdc63aebb10f7bb324c11824c084b5d10a907c2a6114ffb011e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
