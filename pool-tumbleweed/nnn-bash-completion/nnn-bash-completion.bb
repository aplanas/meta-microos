SUMMARY = "Bash completions for nnn"
DESCRIPTION = "The official bash completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.9"

RPM_NAME = "nnn-bash-completion-4.9-1.1.noarch.rpm"
RPM_HASH = "6ccec4e1ec5abfa0267be6edb14a389b55b3c9f1d148c6fc6ee72c03b92311c9e2d7c12f37002b0d9e46de446244ae3ccbb3bf4eb3871acb688af837d6425e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
