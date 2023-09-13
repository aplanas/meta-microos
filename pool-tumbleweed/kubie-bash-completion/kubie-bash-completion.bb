SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.22.0"

RPM_NAME = "kubie-bash-completion-0.22.0-1.1.noarch.rpm"
RPM_HASH = "44c565ea665892b6b6df46970afb362aea2bca813600ec6d65e6cc1c3ced5f364211db1e4ab7a3d8395ea378dc23d68ff4dc69042931c70da29b7884d2ac79b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
