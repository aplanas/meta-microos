SUMMARY = "Documentation for texlive-hecthese"
DESCRIPTION = "This package includes the documentation for texlive-hecthese"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn60455"

RPM_NAME = "texlive-hecthese-doc-2023.201.1.5svn60455-53.2.noarch.rpm"
RPM_HASH = "a3765832e97a183e1c129b9170c4a18acbfbb394c0c560c799feddb2acb4e07947cf87b6052cd7e50e306517aca0efc19b739039392a50fc4096162a48bc699e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hecthese-doc-en;fr \
texlive-hecthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
