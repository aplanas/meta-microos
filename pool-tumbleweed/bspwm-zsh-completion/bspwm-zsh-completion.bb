SUMMARY = "ZSH Completion for bspwm"
DESCRIPTION = "ZSH completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-zsh-completion-0.9.10-1.11.noarch.rpm"
RPM_HASH = "1ea2626ff494a928ab8f0c6394fe407015b3ba7fcde66cd04f27cf8f402e400224467a1fb5f97603921debd345f80fefcdb545e84c77ab690005e4a42a0c6019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-zsh-completion"

RDEPENDS:${PN} += "bspwm"

inherit rpm
