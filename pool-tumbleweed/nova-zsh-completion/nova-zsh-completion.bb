SUMMARY = "Zsh Completion for nova"
DESCRIPTION = "zsh command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-zsh-completion-3.6.5-1.2.noarch.rpm"
RPM_HASH = "341d3e901330c7d9c5e606732b076ed625b794e717931fd8775a2d5b0b7bc6e6f9fe4a9b7f3e24303cd66ced6a4690fe6b772a6ff183086df9cb4daad21bacf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-zsh-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
