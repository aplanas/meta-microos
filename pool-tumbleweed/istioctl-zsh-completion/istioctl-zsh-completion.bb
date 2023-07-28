SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.1"

RPM_NAME = "istioctl-zsh-completion-1.18.1-1.1.noarch.rpm"
RPM_HASH = "4be592d5f160e043575245fa6a42c61c87c81c7c3dc5b340d1148a06096436658f79a4739f49e31bfd6f72fcacd04b37a7904b78444ad756ef8faac5f2023e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"

RDEPENDS:${PN} += "istioctl"

inherit rpm
