SUMMARY = "Zsh completion for highlight"
DESCRIPTION = "This package provides Zsh command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-zsh-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "c59029946e033233192efdb2812be5c7fd0cd866dfec7ba6aa5acfd9b8cb866c03cdbb87e2ad86a02ae24712342bcfbd672a0127bd863ec20959813916e74347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-zsh-completion"

RDEPENDS:${PN} += "highlight \
zsh"

inherit rpm
