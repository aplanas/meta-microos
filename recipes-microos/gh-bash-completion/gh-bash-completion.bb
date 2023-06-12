SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.30.0"

RPM_NAME = "gh-bash-completion-2.30.0-1.1.noarch.rpm"
RPM_HASH = "284b942036af17a47a3ad8d3212acdca4097990349bede55b80c3ac762c428def82b096c0a18fe36f07176add73e65c6519ba50672b987bc1fc3ba6b30bfe66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-bash-completion"
RDEPENDS:${PN} += "bash-completion gh"

inherit rpm
