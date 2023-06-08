SUMMARY = "Bash Completion for firewalld"
DESCRIPTION = "Bash command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-bash-completion-1.3.2-1.1.noarch.rpm"
RPM_HASH = "a37c59031da61e6f64b6c8e6263646b377c402992bf72234c6be0541f3b8469bd8506b03a130cdb02e419c0ae24ff9f9b3904737d3e4b05af91da4b66d6812d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-bash-completion"
RDEPENDS:${PN} += "bash-completion firewalld"

inherit rpm
