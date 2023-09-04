SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-common-9.0.1632-2.2.noarch.rpm"
RPM_HASH = "3d402404e9381e1b17eb96dee8686a665a668a591e66d708083a585439e3b37bac7462d906fbacdb9615b6344c1cc366ec5611cae181b3c8809d674b13981de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"

RDEPENDS:${PN} += ""

inherit rpm
