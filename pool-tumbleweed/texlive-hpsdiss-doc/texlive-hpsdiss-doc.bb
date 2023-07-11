SUMMARY = "Documentation for texlive-hpsdiss"
DESCRIPTION = "This package includes the documentation for texlive-hpsdiss"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "76987e4b741b6b18d02be5ce18e5a3644e1d9408b7ecb3d4a1d4b7320dcdd34a71d22a84ee41de651fa9fee857d2248b66aad77e8ce49ff9adac85f7443875d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hpsdiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
