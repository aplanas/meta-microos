SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-bash-completion-0.19.3-2.4.noarch.rpm"
RPM_HASH = "74b2545430dd3bbacd9c1884717d3804fd56183894fb5389c1c32883fb5421d62e5a09fc619188a3ef061a3e120f462db470efba441cd8d2215ad56dee76c3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
