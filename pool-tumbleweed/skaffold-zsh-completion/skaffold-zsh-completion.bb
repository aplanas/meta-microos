SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.2"

RPM_NAME = "skaffold-zsh-completion-2.6.2-1.1.noarch.rpm"
RPM_HASH = "837717a535ec95c67c6ec6cf8121f6c5208ceac357e8aff5df290547ad6576f4714ae7186aa3d6e43c1df0e4eabb2d6476c615d809a7231f384f8410fbfcc9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
