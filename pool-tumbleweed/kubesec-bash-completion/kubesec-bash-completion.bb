SUMMARY = "Bash Completion for kubesec"
DESCRIPTION = "Bash command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.13.0"

RPM_NAME = "kubesec-bash-completion-2.13.0-1.1.noarch.rpm"
RPM_HASH = "37314d4cd1ecbf2a6c34949c8ad2e7d19d2e6035415d1b5663b679fb2ff3c0596e20e54c3fd86810d4c6f3976bf2620bea061b276da3888c8cc7b8147eaae5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubesec"

inherit rpm
