SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.37.0"

RPM_NAME = "chezmoi-bash-completion-2.37.0-1.1.noarch.rpm"
RPM_HASH = "e00ffde5a535cddc0f0822488c11feab857569e2318509ff17b6222f71d542e43519544e3732259c6c16e20693f564a224388bf1916b7ded3756baffaaf472bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
