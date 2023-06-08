SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.4"

RPM_NAME = "chezmoi-bash-completion-2.33.4-1.1.noarch.rpm"
RPM_HASH = "069d7f77c51c531cddc2c3f840f67f20404f365cb1e2cd2411d54c5a421c91f33b4609fabc75e8dfeb2f12a4ce8ebdbb9f9252e981809bbb05e5f846035aa67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"
RDEPENDS:${PN} += "chezmoi"

inherit rpm
