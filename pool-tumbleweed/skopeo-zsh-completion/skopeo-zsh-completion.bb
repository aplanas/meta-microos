SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-zsh-completion-1.12.0-1.2.noarch.rpm"
RPM_HASH = "65feab5b4920ad16ecaf789d337e8ecd29e4e357efbcec6f330a15785b3c58deb0bac145a6dc518fc0a9106652c0744ba58701fba88114d11635a0ca214c9cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"

RDEPENDS:${PN} += "skopeo \
zsh"

inherit rpm
