SUMMARY = "Documentation for texlive-resumemac"
DESCRIPTION = "This package includes the documentation for texlive-resumemac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-resumemac-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "cc3be6bbcd766b573bd28fa5c358845db182b16029cfee6ee0b02de36bef54f10555b7b4bb407a0d7c342780d60a2f7a403ca09ebf30a9c1e8ef4f10220f8833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumemac-doc"

RDEPENDS:${PN} += ""

inherit rpm
