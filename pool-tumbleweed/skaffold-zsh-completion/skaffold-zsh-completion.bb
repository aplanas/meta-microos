SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "skaffold-zsh-completion-2.6.3-1.1.noarch.rpm"
RPM_HASH = "202c9624de8d672e1a0871614c35f18f015ac997b49e686d79fc4cf02e22eed5bc30bee35430648204f5c8842a04e35d139943b7b44aee1205bcf80dd823867c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
