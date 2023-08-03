SUMMARY = "Documentation for texlive-fast-diagram"
DESCRIPTION = "This package includes the documentation for texlive-fast-diagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-doc-2023.209.1.1svn29264-53.1.noarch.rpm"
RPM_HASH = "473b6aa0dcc1f1121297c08e261f04920cb11997a4296f8e397379e384daa549eab7efa90741810398bcbcba29d597edd7bd94c5f63c75e9425fb7bb631d1c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fast-diagram-doc-fr \
texlive-fast-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
