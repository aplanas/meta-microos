SUMMARY = "Bash Completion for alacritty"
DESCRIPTION = "The official bash completion script for alacritty. It includes support \
for every argument that can currently be passed to alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "alacritty-bash-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "7e53341c3a1b57985f837c207cdc21e838f597fc2fe57ea15e884a315ecc8dfd8ccc0d7ff85064e73f2f84f281be90944ad5103293a170ffcb55a3bcddebf3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
