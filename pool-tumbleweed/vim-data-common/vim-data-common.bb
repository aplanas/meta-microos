SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "vim-data-common-9.0.1572-1.1.noarch.rpm"
RPM_HASH = "27fa95f96dd865709bf0ecae155126f727e530c711538e32d4e9ebef4db1723a4d3e5211f0084e5312420d24e39c9c3d0ab4f69b9227eddc2b2470805299346a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"
RDEPENDS:${PN} += ""

inherit rpm
