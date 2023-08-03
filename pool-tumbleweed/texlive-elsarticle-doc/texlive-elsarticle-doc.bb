SUMMARY = "Documentation for texlive-elsarticle"
DESCRIPTION = "This package includes the documentation for texlive-elsarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn56999"

RPM_NAME = "texlive-elsarticle-doc-2023.209.3.3svn56999-54.1.noarch.rpm"
RPM_HASH = "87563cbafa37b8939a175073bed2653bfbedaa53540227985c58783532de6a57bcefe6f005b826efc7915a9edb281480d0e121cac79376538d8c538a749b1c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elsarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
