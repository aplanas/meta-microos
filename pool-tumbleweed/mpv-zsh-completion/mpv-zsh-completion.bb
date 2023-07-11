SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "mpv-zsh-completion-0.35.1+git.20230315.e1727553-1.5.noarch.rpm"
RPM_HASH = "28325690640be0898b43e656ba171a1b1b65b36cf5a2396bfca6b73c1bd716ec5dec6fc178e63cc4ef8b2f94fd30c5191aa87b99a0873daa11819281acc462b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
