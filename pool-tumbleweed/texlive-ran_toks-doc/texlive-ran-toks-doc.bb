SUMMARY = "Documentation for texlive-ran_toks"
DESCRIPTION = "This package includes the documentation for texlive-ran_toks"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59515"

RPM_NAME = "texlive-ran_toks-doc-2023.201.svn59515-53.2.noarch.rpm"
RPM_HASH = "b8863e771d1e57eacb2e5bd40e131523f1500552ba4332e11a6234b96fe9628988af44a82627ead5cf654c965022a95b1a27ca8455a668a776cbbad3b15a052e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ran-toks-doc"

RDEPENDS:${PN} += ""

inherit rpm
