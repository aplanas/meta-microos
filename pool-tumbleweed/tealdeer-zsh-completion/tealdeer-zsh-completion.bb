SUMMARY = "Zsh Completion for tealdeer"
DESCRIPTION = "Zsh command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-zsh-completion-1.6.1-2.1.noarch.rpm"
RPM_HASH = "ed34e2f22e8a0901dc003387521c2a70906127f1faf2214b31110b702fe6511f039a58cd845a647d86d925f9b77a370593abb5d537c1da85fb4752ac2604d3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
