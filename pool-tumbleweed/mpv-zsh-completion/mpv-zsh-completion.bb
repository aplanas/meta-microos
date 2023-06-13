SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "mpv-zsh-completion-0.35.1+git.20230315.e1727553-1.4.noarch.rpm"
RPM_HASH = "965fd38fff07a2780214bc06a2602d9b0fbe8256eade7d23e2788e3597b611839feeb2dbfebf31a98f99deb68fe7fa472ac10f01cfad2ce9fdfbec2d854b9755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
