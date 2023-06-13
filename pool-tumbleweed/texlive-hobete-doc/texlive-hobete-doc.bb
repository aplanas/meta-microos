SUMMARY = "Documentation for texlive-hobete"
DESCRIPTION = "This package includes the documentation for texlive-hobete"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27036"

RPM_NAME = "texlive-hobete-doc-2023.201.svn27036-53.1.noarch.rpm"
RPM_HASH = "d9979b31a8667a5d3be7375f401e0fbffa24ab252d68d5a7a965e1c5bec1475e40fcf677fbfa1ef23860ab1d22c8e2537b8e2de23ef80442981009d90048edc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hobete-doc:de) \
texlive-hobete-doc"

RDEPENDS:${PN} += ""

inherit rpm
