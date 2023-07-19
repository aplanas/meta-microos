SUMMARY = "Zsh Completion for fuzzel"
DESCRIPTION = "Zsh command-line completion support for fuzzel"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "fuzzel-zsh-completion-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "e63ecf4aed8c12374ba10526084536ea66caf860a31367b4296a61b0ef62df75983fca73945457bb2ce21645dcf3a844fff3e8acd6d1de5ff5c96b4ef1c26c1a"

RPROVIDES:${PN} += "fuzzel-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
