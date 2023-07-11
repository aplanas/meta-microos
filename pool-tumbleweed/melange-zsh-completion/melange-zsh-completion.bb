SUMMARY = "Zsh Completion for melange"
DESCRIPTION = "zsh command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-zsh-completion-0.3.2-1.3.noarch.rpm"
RPM_HASH = "50f4563d5e737280a8c2a0634913b26b119cae84e6d5a82b6044be94ce99a18f97361c0d281e30b25d0f1ef419d5ee41e7edbd32676b0c63224241e09b9155ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-zsh-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
