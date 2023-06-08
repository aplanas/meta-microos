SUMMARY = "Zsh Completion for exa"
DESCRIPTION = "Zsh command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-zsh-completion-0.10.1-3.4.noarch.rpm"
RPM_HASH = "373521c5eb0e27a864dbbde8f5048748117e2f9959c9bfb58ff206ca6f04eda18e12f7389569aec25916667bafea365f18b1dffdb786c38ee39bb43f0fc2e113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-zsh-completion"
RDEPENDS:${PN} += "exa"

inherit rpm
