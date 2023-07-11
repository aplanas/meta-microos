SUMMARY = "Bash Completion for restic"
DESCRIPTION = "Bash command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-bash-completion-0.15.2-1.3.noarch.rpm"
RPM_HASH = "b59b43aba84442db04e6f0c02fb5d6a3611a93f7902f9294332e8ec70c49c1042a2e1a42227c61cfa015f6e0548e4b04e768262656d2ce9bf845f28e55578dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "restic-bash-completion"

RDEPENDS:${PN} += "restic"

inherit rpm
