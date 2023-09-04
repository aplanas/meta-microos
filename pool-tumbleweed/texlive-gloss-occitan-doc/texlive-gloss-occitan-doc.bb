SUMMARY = "Documentation for texlive-gloss-occitan"
DESCRIPTION = "This package includes the documentation for texlive-gloss-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-doc-2023.209.0.0.1svn52593-54.2.noarch.rpm"
RPM_HASH = "8ff7b0e527248dde8aba24089bfe847f621ec04a2499b829fda082ca786f280b9ff3ec7d18ef421473caef327121f11174d076a741e533da5a318dd716045981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
