SUMMARY = "Documentation for texlive-ebproof"
DESCRIPTION = "This package includes the documentation for texlive-ebproof"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-doc-2023.201.2.1.1svn57544-53.1.noarch.rpm"
RPM_HASH = "e5ee7da18b57125691dc87fe6f184ad6520ec5dd29d05761183577c28d8f131f613c364f181740869de75eec182224575eb57f0d55acd1b923f8a11b601296f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
