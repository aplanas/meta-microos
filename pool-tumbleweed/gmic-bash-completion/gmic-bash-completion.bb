SUMMARY = "Bash completion for gmic"
DESCRIPTION = "This package contains the bash completion command for gmic."
LICENSE = "CECILL-2.1"

PV = "3.2.5"

RPM_NAME = "gmic-bash-completion-3.2.5-1.1.noarch.rpm"
RPM_HASH = "0c3772a4b8daac75f4326e75de50fbe9018507377d81c57608bba99c7fb2c9f703eb44db30535a02357b6e4a53c571a618678b934823034d328af92e38b7b2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
