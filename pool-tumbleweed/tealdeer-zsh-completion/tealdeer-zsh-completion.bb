SUMMARY = "Zsh Completion for tealdeer"
DESCRIPTION = "Zsh command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-zsh-completion-1.6.1-2.3.noarch.rpm"
RPM_HASH = "bc0a9d17686f9c46337be608b94057360645910b85e4a9e3705cd46c4f3a5cc2c4d316eac261ff6fc8b25a144996b4e8f4b5e3806e5f8886b8111b298ddbe3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
