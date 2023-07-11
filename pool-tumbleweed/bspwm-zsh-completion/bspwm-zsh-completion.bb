SUMMARY = "ZSH Completion for bspwm"
DESCRIPTION = "ZSH completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-zsh-completion-0.9.10-1.12.noarch.rpm"
RPM_HASH = "2d469530010b4d104477f2528f098851b29c314da3652455f148964ffa09f247e544cdf026d1fdd2b05105ae33ddd9965c1ef3804f910b0661cf7a13e5eb465a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-zsh-completion"

RDEPENDS:${PN} += "bspwm"

inherit rpm
