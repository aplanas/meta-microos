SUMMARY = "Bash completion for wl-clipboard"
DESCRIPTION = "Bash command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-bash-completion-2.1.0-1.7.noarch.rpm"
RPM_HASH = "ebfd3f601035ef4c588b168df5deae5cb986b968c7abbc9cc9b4225d56a48f75c82d8977c56e049e5f5fdaf2be096d581f42641c626ed1a85e2ec2fb80bf6e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-bash-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
