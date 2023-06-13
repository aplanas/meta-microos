SUMMARY = "Zsh Completion for nova"
DESCRIPTION = "zsh command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-zsh-completion-3.6.5-1.1.noarch.rpm"
RPM_HASH = "92a289a0cc0f0b053f34c1654686605f327add90214c9fcf95cf6b08fc31923c8087fd200c129c5457e9112ba70bc66d7bffef23466925d3089dddf2c029a0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-zsh-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
