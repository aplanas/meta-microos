SUMMARY = "Bash Completion for restic"
DESCRIPTION = "Bash command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.16.0"

RPM_NAME = "restic-bash-completion-0.16.0-1.1.noarch.rpm"
RPM_HASH = "0694275ef3637cba588503a00c090620a1151dbe7a279455bb638e749b5c044d255c4d47353dc18d2df375044e689f0083a0b51bfef5959da1eb3495a5b229bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "restic-bash-completion"

RDEPENDS:${PN} += "restic"

inherit rpm
