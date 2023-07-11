SUMMARY = "ZSH completion for playerctl"
DESCRIPTION = "ZSH command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-zsh-completion-2.4.1-1.9.noarch.rpm"
RPM_HASH = "648aac347f7372eb23dcf23fd815362c4901ff45821bb83b2cd6bb6667a15ad4f2861a6928dd72cf87815e7ff6cdffd6afe176955509c6a29f83d64ba24dcba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
