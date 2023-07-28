SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.35.0"

RPM_NAME = "chezmoi-bash-completion-2.35.0-1.1.noarch.rpm"
RPM_HASH = "1f4089d97770dc9c598023ca57a6c09b5a9cf74d575dd7dfb66240f3075dc28ecbdbc79fb95a52558e1be3d2acd15a8b05d67c2289c89417d2ba8129ab6713f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
