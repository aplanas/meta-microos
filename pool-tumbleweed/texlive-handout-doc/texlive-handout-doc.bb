SUMMARY = "Documentation for texlive-handout"
DESCRIPTION = "This package includes the documentation for texlive-handout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.0svn43962"

RPM_NAME = "texlive-handout-doc-2023.209.1.6.0svn43962-54.2.noarch.rpm"
RPM_HASH = "ba6abe955c630b24ab3dcfd7cffc891b0a68855b229980efbb362cacde1fbab37bc9b14d5f45a1639b3cfb4cd18846f333acc2971c0b6a54ab138d8db7a71978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handout-doc"

RDEPENDS:${PN} += ""

inherit rpm
