SUMMARY = "Zsh Completion for flux2-cli"
DESCRIPTION = "zsh command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "flux2-cli-zsh-completion-2.0.1-1.1.noarch.rpm"
RPM_HASH = "9b690a3f685bd99385ae8c7909131f946aac70629b99fd897290134d1aa119742137105aba0fc1f21348f7bd78f6eb164afcd0dd5b93f5d8f7086e69d2e92c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-zsh-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
