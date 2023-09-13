SUMMARY = "Zsh Completion for kyverno"
DESCRIPTION = "zsh command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "kyverno-zsh-completion-1.10.3-1.1.noarch.rpm"
RPM_HASH = "2c69f541c342b46b192d039bf3ab7ef079382a92c7aaf36ed1bd2267e9bc3fd6e9b394c9773d2d0a39b00c01bc3f96122cfdfce51a21caad7dc375ee1ed1a4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-zsh-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
