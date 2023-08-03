SUMMARY = "Documentation for texlive-xargs"
DESCRIPTION = "This package includes the documentation for texlive-xargs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xargs-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "17cbc2909cf4e4a4065aa21db6e1c11b2324bd4b6ec7d030acaece8326d7739f28be7e752abcdb2991ec773d9d2d0fd3a1e2fc45641e450520f51993df20db88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xargs-doc-fr;en \
texlive-xargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
