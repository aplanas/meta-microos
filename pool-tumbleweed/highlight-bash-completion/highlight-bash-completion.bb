SUMMARY = "Bash completion for highlight"
DESCRIPTION = "This package provides Bash command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-bash-completion-4.7-1.1.noarch.rpm"
RPM_HASH = "832b961158e6505f6f8ef1158c552ef35891799a89cce5fb6f77a6a60115d3b1464e08738cd2a523402e07aa34f9f9b54424135acb7ba112b600b5a0e2cdb374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-bash-completion"

RDEPENDS:${PN} += "bash-completion \
highlight"

inherit rpm
