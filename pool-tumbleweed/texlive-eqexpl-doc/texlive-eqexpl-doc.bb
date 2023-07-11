SUMMARY = "Documentation for texlive-eqexpl"
DESCRIPTION = "This package includes the documentation for texlive-eqexpl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-doc-2023.201.1.1.1svn63629-53.2.noarch.rpm"
RPM_HASH = "83799866debc5809e468aef92575280c3f64b21e704e001080f285a6bcc1cdbe9ec8d6dea663b37a34fef2e86402be5d0ef6cbefdb42cc71bf8938a9b3bd3900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eqexpl-doc-ru \
texlive-eqexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
