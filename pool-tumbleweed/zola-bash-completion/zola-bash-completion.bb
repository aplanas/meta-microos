SUMMARY = "Bash Completion for zola"
DESCRIPTION = "Bash command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-bash-completion-0.17.2-2.2.noarch.rpm"
RPM_HASH = "097f4761c79620ae837b30cb3cd2bc7ed196886a70800d0980c9976ca5dd41a8dfd43faf99ac2b50592845f84ee5acedefaad5a6696e6b0055b376c93a5a62ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
