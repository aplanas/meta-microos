SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.1"

RPM_NAME = "rclone-bash-completion-1.63.1-1.1.noarch.rpm"
RPM_HASH = "344e90a3559200de34ef5c44c7faae06958e31afe1b55e6c19682c39830da1a9fb7dfc80b2bcc456aacc931cafe12a02a76fcd78a6184732b601340ad1ad57a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
