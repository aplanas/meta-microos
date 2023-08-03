SUMMARY = "Documentation for texlive-edmargin"
DESCRIPTION = "This package includes the documentation for texlive-edmargin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn27599"

RPM_NAME = "texlive-edmargin-doc-2023.209.1.2svn27599-54.1.noarch.rpm"
RPM_HASH = "871f37051f0a7c48f6bac592f503fb7c8a97b790831dc8474732534a3c42745c82f85ac0fe813950046d602eaabf1e79b60288a7ffd278fed9be43e123f788ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm
