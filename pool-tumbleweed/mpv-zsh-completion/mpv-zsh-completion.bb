SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-zsh-completion-0.36.0+git.20230723.60a26324-1.2.noarch.rpm"
RPM_HASH = "3a509a7691b8edb1a84a186776900583b30b543c41177cd71423eea6449bc00d8e3e0dcac967fb86f6a2c740bb1b294548638dfc8f936bdaacf40ffad237f763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
