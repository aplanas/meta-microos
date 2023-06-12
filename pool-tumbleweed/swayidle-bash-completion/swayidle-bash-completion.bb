SUMMARY = "Bash completion for swayidle"
DESCRIPTION = "Bash command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-bash-completion-1.8.0-1.2.noarch.rpm"
RPM_HASH = "36a56dbd0e8be93ac5573dbe194c73a574dd338e311d8d601cfe90713f36598beddf57988092d0090a5a371b643d04d1f3d74c46911c433dbaa898ad681e71a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-bash-completion"
RDEPENDS:${PN} += "swayidle"

inherit rpm
