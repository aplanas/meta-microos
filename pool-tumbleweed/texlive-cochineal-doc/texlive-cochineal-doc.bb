SUMMARY = "Documentation for texlive-cochineal"
DESCRIPTION = "This package includes the documentation for texlive-cochineal"
LICENSE = "OFL-1.1"

PV = "2023.209.1.077svn62063"

RPM_NAME = "texlive-cochineal-doc-2023.209.1.077svn62063-54.1.noarch.rpm"
RPM_HASH = "f67837c6643f7c6339adcc343f82066bdb16e9cb1057465aded71577155af94fdc76cbe0f6b302c8d505ff864090a754a06d4177810a9144cd46af36d9134393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cochineal-doc"

RDEPENDS:${PN} += ""

inherit rpm
