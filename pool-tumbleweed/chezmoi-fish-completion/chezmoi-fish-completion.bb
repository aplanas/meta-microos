SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.36.1"

RPM_NAME = "chezmoi-fish-completion-2.36.1-1.1.noarch.rpm"
RPM_HASH = "5f22fc1a61a755be428f68fd8bef65934d986698333308bfa272974644acc09a9cf71e08875392923bc75ec2bd24d9913b58dc504adc8486551648619fe1d1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
