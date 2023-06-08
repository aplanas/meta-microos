SUMMARY = "Bumblebee themes using awesome and powerline fonts"
DESCRIPTION = "Bumbebee themes using awesome-fonts and powerline-fonts."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-theme-powerline-2.1.5-3.3.noarch.rpm"
RPM_HASH = "77858cf3f02f4e6aac386ff2901b869bf93ca8138fce46cf96ab52fd72e3fd191955ebbd9d3061ec6481ee7410c7a2abad14537244e2786979a20bde32e8ae17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-theme-powerline"
RDEPENDS:${PN} += "bumblebee-status fontawesome-fonts powerline-fonts"

inherit rpm
