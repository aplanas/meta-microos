SUMMARY = "ZSH completion for playerctl"
DESCRIPTION = "ZSH command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-zsh-completion-2.4.1-1.8.noarch.rpm"
RPM_HASH = "dea3acc4ee3d2ad9ced600f8d299df3d2f606fcb101f1ae629f6aacf2d36183df86b41d0724433c8d11ba4cfbebb2a246ba91a750edb3e0534f6eb80e9a4c19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
