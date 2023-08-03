SUMMARY = "Documentation for texlive-easyreview"
DESCRIPTION = "This package includes the documentation for texlive-easyreview"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38352"

RPM_NAME = "texlive-easyreview-doc-2023.209.1.0svn38352-54.1.noarch.rpm"
RPM_HASH = "7cf06e1ce27d99369ab315145b29d19b6d51d970be83ee5600b65430e19c16e0cb1ce3adf96b18ddd897b37f7aa18a9526ddc9f8718df00bfdcea56e42b11446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyreview-doc"

RDEPENDS:${PN} += ""

inherit rpm
