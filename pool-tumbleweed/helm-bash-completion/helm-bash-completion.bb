SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "helm-bash-completion-3.12.0-1.1.noarch.rpm"
RPM_HASH = "1caf62745259573c6fe32b7597d0ec015828560cea43540774013fee88beac7ddb4ddff1b7469621833e66100bace5ad4a797809c58f8ec15e87d0896abd2643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
