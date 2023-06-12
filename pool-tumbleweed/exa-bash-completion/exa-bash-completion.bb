SUMMARY = "Bash Completion for exa"
DESCRIPTION = "Bash command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-bash-completion-0.10.1-3.4.noarch.rpm"
RPM_HASH = "460b19551c4abe784d0c1ce52e7eaf9fca16371641e1be647c99097dcee3802afe32b5fcadc95522083cff68bf6edf92dae8dd3a2f6355bae4f9bf824eb56e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-bash-completion"
RDEPENDS:${PN} += "exa"

inherit rpm
