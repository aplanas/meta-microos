SUMMARY = "Documentation for texlive-qobitree"
DESCRIPTION = "This package includes the documentation for texlive-qobitree"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qobitree-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "a77c90a24a92429fe27c79dab57e4f632cd3e9a52699040ac0e20595aa1e9e18f93973181dab88ee4a71a7c234f8cebd12a0a1868ba45aa9fdaeec79481b55d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qobitree-doc"

RDEPENDS:${PN} += ""

inherit rpm
