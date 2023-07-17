SUMMARY = "Bash Completion for kubie"
DESCRIPTION = "Bash command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.20.0"

RPM_NAME = "kubie-bash-completion-0.20.0-1.1.noarch.rpm"
RPM_HASH = "a373d572ae486b87dd7c898e7cd9e0f5a532e8d831d7bffb7d810f019eb35c1aaa8c127add71afdf90d1f472d1a6cba28b554c328559891cd9278ac6cdf6ab62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubie"

inherit rpm
