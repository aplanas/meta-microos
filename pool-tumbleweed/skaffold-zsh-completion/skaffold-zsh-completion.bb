SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.1"

RPM_NAME = "skaffold-zsh-completion-2.6.1-1.1.noarch.rpm"
RPM_HASH = "f5254d8866282d5747486ce0c3833ae6de6c15cf0e0590377cf70cab5429d58da707fbafc784f2cab1971ab44817c29a0f03bdba3bc645d0c41b53d92f91b366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
