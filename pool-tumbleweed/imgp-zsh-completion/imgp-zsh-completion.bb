SUMMARY = "ZSH Completion for imgp"
DESCRIPTION = "ZSH command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "imgp-zsh-completion-2.8-1.8.noarch.rpm"
RPM_HASH = "a641c5eace5fdf15b7ab7436a287b8f9a7cda07901568160ad822d344e28386e5d524970034dd0519470355e43260b44dfdbe8531ac54c5f5f12609dbdbf29d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-zsh-completion"

RDEPENDS:${PN} += "imgp"

inherit rpm
