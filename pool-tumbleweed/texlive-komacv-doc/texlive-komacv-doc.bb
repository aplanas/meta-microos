SUMMARY = "Documentation for texlive-komacv"
DESCRIPTION = "This package includes the documentation for texlive-komacv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn57721"

RPM_NAME = "texlive-komacv-doc-2023.209.1.1.2svn57721-56.1.noarch.rpm"
RPM_HASH = "0f3390361ced5123c0b3ac0b4b9b6fa1704c6cfa813e46006baffda367a7f03348801b6643cf7100b0153c682391ba1683e732091ae12304b737226805687a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-doc"

RDEPENDS:${PN} += ""

inherit rpm
