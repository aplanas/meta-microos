SUMMARY = "ZSH Completion for hyperfine"
DESCRIPTION = "The official zsh completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-zsh-completion-1.17.0-2.1.noarch.rpm"
RPM_HASH = "0790df05628e9f05cff79602d2ecdf3af5f9e1863cff2792cae7b851603951ccc7d115b876f3e16e5d01961858443bc8e36eb014d4333512b0a01cc0e1dbff94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
