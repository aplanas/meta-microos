SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-common-9.0.1632-2.1.noarch.rpm"
RPM_HASH = "e24ab281544db991d1eb7508a567e02e48f038729fa5bba54ec83e0dff9c92d71a807a15488186b200796d76196f85a92c80ba82543bed088a2e43ff7b0fe737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"

RDEPENDS:${PN} += ""

inherit rpm
