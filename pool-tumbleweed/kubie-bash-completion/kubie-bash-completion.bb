SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.20.1"

RPM_NAME = "kubie-bash-completion-0.20.1-1.1.noarch.rpm"
RPM_HASH = "f91f3519146aeda8ba1060118444d9850aaf523d50c60c8def1fe478e30dabe49d94f0f4ae47b6a2a15192af211e08f068e796222c9a1a199c287166adc47966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
