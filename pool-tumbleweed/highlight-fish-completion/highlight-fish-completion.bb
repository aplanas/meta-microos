SUMMARY = "Fish completion for highlight"
DESCRIPTION = "This package provides Fish command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-fish-completion-4.7-1.1.noarch.rpm"
RPM_HASH = "bdb2ffc5a8d27a0ab27ac9abe4d8ff294b353d86cb6e392936c33c69ada111926084bd2289c78225debc60883c51344c744ebcb04279b58b3b0c55f1785ce198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-fish-completion"

RDEPENDS:${PN} += "fish \
highlight"

inherit rpm
