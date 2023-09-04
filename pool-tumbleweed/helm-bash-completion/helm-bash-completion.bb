SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "helm-bash-completion-3.12.3-1.1.noarch.rpm"
RPM_HASH = "e0ac6de0f90bb56825cb6f271c76e1d1fa3eb7a319ab316de85e3048d5847994222972b4e302736feda648ed3fbfad14f0c9e37ebfded675502acc4344c86a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
