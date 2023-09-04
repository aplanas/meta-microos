SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "skopeo-zsh-completion-1.13.2-1.1.noarch.rpm"
RPM_HASH = "85203594e8fed2e6f00ceff87bdead60e7e2451bba131fc831b14df7a41505335092d559eeb2792eb60d65ac7bcdaa601c4162c14cb1896497eddc33ef697f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"

RDEPENDS:${PN} += "skopeo \
zsh"

inherit rpm
