SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.1"

RPM_NAME = "helm-zsh-completion-3.12.1-1.1.noarch.rpm"
RPM_HASH = "5f53d36649739759dc7dee9f2cf77230eeeeee48b78c423d2d1223a11608fff633a1abbf2ea36bd8bcf728c410d7e6c08812eaca1184b3a0427aa2f86b03f0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
