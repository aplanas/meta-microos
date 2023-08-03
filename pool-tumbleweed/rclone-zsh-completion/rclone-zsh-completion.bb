SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.1"

RPM_NAME = "rclone-zsh-completion-1.63.1-1.1.noarch.rpm"
RPM_HASH = "9314111bbdfafcf3e14fae50cddb02e8501947f82101566d0e1a2d84b6c36525f93a2b8e6c19a0787623f21c63bd249a3fd23ca98eee6b6744c5fa9d55646d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
