SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-zsh-completion-1.63.0-1.1.noarch.rpm"
RPM_HASH = "07245e7be977ac9ab96b77a920744b655498fa45435bf640e7aded399892e8b51b8bfc162a4b17539f9bddda324cdb072ab7f11e1e3cf26c832749d042002d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
