SUMMARY = "Bash Completion for lf"
DESCRIPTION = "Bash command-line completion support for lf."
LICENSE = "MIT"

PV = "30"

RPM_NAME = "lf-bash-completion-30-1.1.noarch.rpm"
RPM_HASH = "618a54df7efd845a6418a20ca114f9489875ce94e83cc5a6e877816cea08ae7cd965b44abd42e2fb16f575bb495c023f1b9a919da161a67ec88d3a8614cebf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
