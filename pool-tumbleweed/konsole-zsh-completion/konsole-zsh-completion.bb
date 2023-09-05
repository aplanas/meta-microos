SUMMARY = "ZSH completion for konsole"
DESCRIPTION = "ZSH command line completion support for konsole."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konsole-zsh-completion-23.08.0-1.1.noarch.rpm"
RPM_HASH = "5d67b374a71ab18404815f400d143090c3b9fa127e79b9022e744112ad252a9ecb09cdf411b969d864c8b8561180fb44a089c014d18ecbb0882ea4851a81e557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-zsh-completion"

RDEPENDS:${PN} += "konsole"

inherit rpm
