SUMMARY = "ZSH Completion for xwallpaper"
DESCRIPTION = "Zsh shell completion for xwallpaper"
LICENSE = "ISC"

PV = "0.7.4"

RPM_NAME = "xwallpaper-zsh-completion-0.7.4-1.3.noarch.rpm"
RPM_HASH = "6346a45874e44712b93285bffbe8e1680b48636c7561663a896074bd32774201de3f21ed449f3623e5e41ae851216c6351f0ef142bf5e9fd265987c617d397b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xwallpaper-zsh-completion"

RDEPENDS:${PN} += "xwallpaper"

inherit rpm
