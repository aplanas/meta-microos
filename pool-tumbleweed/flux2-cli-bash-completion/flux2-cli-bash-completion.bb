SUMMARY = "Bash Completion for flux2-cli"
DESCRIPTION = "Bash command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "flux2-cli-bash-completion-2.0.0-1.1.noarch.rpm"
RPM_HASH = "4a0a5d8f30ac419cceb459f788623a6622b41eda2454bb50cb887295baeed8ab3371eb6aab550d779b497f5306d896693b49f38ace382c8fffd49b8e92e7398e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flux2-cli"

inherit rpm
