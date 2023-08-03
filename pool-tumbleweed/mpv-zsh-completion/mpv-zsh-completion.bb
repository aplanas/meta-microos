SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-zsh-completion-0.36.0+git.20230723.60a26324-1.1.noarch.rpm"
RPM_HASH = "382fae8bce5ab4f430c6807e124796766dd6f024122366dc887ce07bb2b9b08eae1a009e76ef535348b39588d6503d04f891d2e104cbb010ac78c6187445f898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
