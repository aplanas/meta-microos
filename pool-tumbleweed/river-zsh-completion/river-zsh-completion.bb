SUMMARY = "Zsh Completion for river"
DESCRIPTION = "Zsh command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-zsh-completion-0.2.4+g953-2.1.noarch.rpm"
RPM_HASH = "8b5d590f00dbc359b4a12e6d408035f93c23b6db9fbfffbf583920a033c35652413b2f89bd23cd2597cdb5c3e951eced5013203afafa3523666baad913cfed07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
