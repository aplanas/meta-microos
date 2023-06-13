SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-zsh-completion-1.12.0-1.1.noarch.rpm"
RPM_HASH = "838b93a387e74b1fe2e612e4e7261c607063b3c2036f122e446e834de2788a540c9409629244d795269f65726bfc275c1c999db38c364d020054f66d382d55b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"

RDEPENDS:${PN} += "skopeo \
zsh"

inherit rpm
