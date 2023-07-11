SUMMARY = "Bash completion for android-tools"
DESCRIPTION = "Bash command line completion support for android-tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-bash-completion-34.0.1-2.1.noarch.rpm"
RPM_HASH = "e5595f0a3ab6a8ea96e4eafdac8286772554b6145d8db4f458539c5743f5b3a71d997a686acf91bebb6fcf6086eb7743f3b3e56d6c84bc576ddfcf7485941f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
