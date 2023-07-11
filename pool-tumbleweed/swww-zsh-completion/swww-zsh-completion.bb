SUMMARY = "Zsh Completion for swww"
DESCRIPTION = "Zsh command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-zsh-completion-0.7.3-1.2.noarch.rpm"
RPM_HASH = "cd5bec27896783be999c19490819373bf84559e5f89396edae78119d6fb39e81640fff5a32203999e36c99f0a1e8325809d3a9e222e984a3c83d47fae627d175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
