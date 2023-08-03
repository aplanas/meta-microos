SUMMARY = "Bash completion for gnuastro"
DESCRIPTION = "Bash command line completion support for gnuastro"
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-bash-completion-0.19-1.12.noarch.rpm"
RPM_HASH = "21302dd386c3a9f44e1ec2b69295412a7c32e946477adb6f78c6741df0150c1eabee63f9211595b52b7267f807c45a3a9b539292abaa79a6d27415fd2a39416e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
