SUMMARY = "Bash completion for augeas"
DESCRIPTION = "bash command line completion support for augeas."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-bash-completion-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "07d938fe0cb5325fd5f54f28d466376a2d4fce666de9ea6dbd2e300a282a9a3934a2d5a398658d1da4bd6a2d5220404cfe0e328ca1142b0bf43312dec8172df9"

RPROVIDES:${PN} += "augeas-bash-completion"

RDEPENDS:${PN} += "augeas \
bash-completion"

inherit rpm
