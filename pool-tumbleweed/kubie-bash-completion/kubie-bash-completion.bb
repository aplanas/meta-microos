SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.21.0"

RPM_NAME = "kubie-bash-completion-0.21.0-1.1.noarch.rpm"
RPM_HASH = "8ed55e4a89182b53944d6dbffeea54942acee22f2f111210b8d3c66913554ebcce32847888d885f01b51c7f480222838c7e500e097b695a9cf858cabc59a8b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
