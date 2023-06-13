SUMMARY = "Documentation for texlive-menu"
DESCRIPTION = "This package includes the documentation for texlive-menu"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.994svn15878"

RPM_NAME = "texlive-menu-doc-2023.201.0.0.994svn15878-54.1.noarch.rpm"
RPM_HASH = "0db0b800b5173dac17fdf39fa004c10aaa978920d34bdd541ca513399c8049bff15ed730af07ce9b3dbf1db1aac2908144e9a3a8ebba38caab80b99193a471d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menu-doc"

RDEPENDS:${PN} += ""

inherit rpm
