SUMMARY = "Bash Completion for bspwm"
DESCRIPTION = "Bash completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-bash-completion-0.9.10-1.11.noarch.rpm"
RPM_HASH = "6127381ccd24df0dbee52dc026947b3673a6ae255cb572ecc4220ed1b8b1ce54f4967ceae1b2243112246c85d1ae9835c59c314288096d73cc8c19ade5491167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bspwm"

inherit rpm
