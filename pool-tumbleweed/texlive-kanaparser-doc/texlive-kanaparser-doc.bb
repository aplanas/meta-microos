SUMMARY = "Documentation for texlive-kanaparser"
DESCRIPTION = "This package includes the documentation for texlive-kanaparser"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0svn48052"

RPM_NAME = "texlive-kanaparser-doc-2023.209.1.0svn48052-56.1.noarch.rpm"
RPM_HASH = "51a38d7794765248b6c35ae55abaf75494538b425fc4965bf7aa92534e01e50275d73ceee403008bf09d0b5fad67fce6be56e53069265b835b4c570f297eb334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kanaparser-doc"

RDEPENDS:${PN} += ""

inherit rpm
