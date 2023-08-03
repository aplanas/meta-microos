SUMMARY = "Bash Completion for lxc"
DESCRIPTION = "Bash command line completion support for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "lxc-bash-completion-5.0.3-1.1.noarch.rpm"
RPM_HASH = "cf1123619706e725b2c0a7089a182653733d3d16c2f25a8c894686751fbb4d0df715294c6d5152e2956b1ab011ea6f9aaa47a49e8256037506faee867403321c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-bash-completion"

RDEPENDS:${PN} += "lxc"

inherit rpm
