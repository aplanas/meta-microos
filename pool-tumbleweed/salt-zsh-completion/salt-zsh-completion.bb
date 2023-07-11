SUMMARY = "Zsh Completion for salt"
DESCRIPTION = "Zsh command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-zsh-completion-3006.0-1.4.noarch.rpm"
RPM_HASH = "05fffad8153684da24ded09c162d674862aa5a014e4e97795318f709de12750d9049985d04ebc5c85089a74f1920a77069e6ad197090b6eea2d1f35b4d6883d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-zsh-completion \
salt-zsh-completion"

RDEPENDS:${PN} += "salt \
zsh"

inherit rpm
