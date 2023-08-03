SUMMARY = "Documentation for texlive-eqlist"
DESCRIPTION = "This package includes the documentation for texlive-eqlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32257"

RPM_NAME = "texlive-eqlist-doc-2023.209.2.1svn32257-54.1.noarch.rpm"
RPM_HASH = "daa8f3deab1192d29b8580ddbd9b871205efb7221da07b7c7dc0072ac31f3e415642c84519583050d0d05d0f94838ab62b5f2cd7a688cac8811b5b6d1633ecce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
