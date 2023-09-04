SUMMARY = "Documentation for texlive-qobitree"
DESCRIPTION = "This package includes the documentation for texlive-qobitree"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qobitree-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "c463ba60d3669ead1d5cfff0b7005c8c6399b9aac25cff84dc15a9de1118c1f07c63d20643db4752c40c471cc17b6cf5163261eae68a62b13534f1977cfaed96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qobitree-doc"

RDEPENDS:${PN} += ""

inherit rpm
