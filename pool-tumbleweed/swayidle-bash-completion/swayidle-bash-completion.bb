SUMMARY = "Bash completion for swayidle"
DESCRIPTION = "Bash command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swayidle-bash-completion-1.8.0-1.3.noarch.rpm"
RPM_HASH = "70372a1556c69442812804cc13b7b43713fd9f22680a26cd900c58d1d49a1a925f0b6ed8d547ff26bb3260f446754f89479e3fb1be4e4254f85a70640872b288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-bash-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
