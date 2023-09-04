SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git20230826.83c0e980"

RPM_NAME = "mpv-zsh-completion-0.36.0+git20230826.83c0e980-1.1.noarch.rpm"
RPM_HASH = "e58b2a4a61299370739d7be550e25997593617bf573db6a7cd100188fc05cc4c75542a18099e87e3fc50d4589c63aac6b5548d3ea297bcf9884bad577eec8b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
