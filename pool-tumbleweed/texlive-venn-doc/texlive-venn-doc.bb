SUMMARY = "Documentation for texlive-venn"
DESCRIPTION = "This package includes the documentation for texlive-venn"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-venn-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "fc3e857fd539aa373b925518587e28851a8d5546e3925fa4221c1f4ab77f5d453aef6b505ee06826fd2bf95e75dfa0b7ad9624c65d09e5b7832a09f8a0b54610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn-doc"
RDEPENDS:${PN} += ""

inherit rpm
