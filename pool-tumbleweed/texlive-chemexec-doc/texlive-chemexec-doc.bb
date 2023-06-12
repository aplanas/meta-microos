SUMMARY = "Documentation for texlive-chemexec"
DESCRIPTION = "This package includes the documentation for texlive-chemexec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21632"

RPM_NAME = "texlive-chemexec-doc-2023.201.1.0svn21632-53.1.noarch.rpm"
RPM_HASH = "1e52143bc69f58031dfe06b9f0e052150a4487287e95b89a525d5d362586428c19a5ee593c36cec81be98e78748ec29f744bcde4ad028876ed1644f0e95ced90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chemexec-doc:de;en) \
texlive-chemexec-doc"
RDEPENDS:${PN} += ""

inherit rpm
