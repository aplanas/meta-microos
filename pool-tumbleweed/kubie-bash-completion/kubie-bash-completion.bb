SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-bash-completion-0.19.3-2.3.noarch.rpm"
RPM_HASH = "bccbef74dbdc527a8634e08f73a4a387c9f948f8bb20a17ac1b7443542ba42a0a0e7c698f0ae7857b8a86d7c570a58dfda16f3c55cb6ff74bcb58658f2f37d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
