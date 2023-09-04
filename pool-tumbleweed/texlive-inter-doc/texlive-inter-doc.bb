SUMMARY = "Documentation for texlive-inter"
DESCRIPTION = "This package includes the documentation for texlive-inter"
LICENSE = "OFL-1.1"

PV = "2023.209.svn58892"

RPM_NAME = "texlive-inter-doc-2023.209.svn58892-54.1.noarch.rpm"
RPM_HASH = "eba12512be1cc72bf9837b22d39637aed72543bb064d351b8d608d785ba6bb3adff17acbab3a650615a92e8ba99a88014881e2e96024dd6b807fcf364eeecca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inter-doc"

RDEPENDS:${PN} += ""

inherit rpm
