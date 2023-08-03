SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "skopeo-zsh-completion-1.13.0-1.1.noarch.rpm"
RPM_HASH = "7da1124eece9aed371816aa3e6b1435cd181847d5179da9fc64f16545160bfcfeca6f5edf99ab69652c027335d0ea4e241a80dcd9125ba4063d3f77a0dc79e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"

RDEPENDS:${PN} += "skopeo \
zsh"

inherit rpm
