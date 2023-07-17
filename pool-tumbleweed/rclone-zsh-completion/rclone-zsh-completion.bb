SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-zsh-completion-1.63.0-2.1.noarch.rpm"
RPM_HASH = "a81084f6f1e0d9de1c748b9d5a80e51425eb97e904561e1be3f899be87478776dfd8a84b23e742c79b43208df439058d045983513e8b16b221467061713a143d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
