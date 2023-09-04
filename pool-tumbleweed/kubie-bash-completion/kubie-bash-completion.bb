SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.21.2"

RPM_NAME = "kubie-bash-completion-0.21.2-1.1.noarch.rpm"
RPM_HASH = "d525eb7aa74439c1dcda8691bc3b2b59612854cec5767b0bca768207a14b720b520cb207b7392f09679b804243bb49528d768049bb4af4508f62fcda146f2c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
