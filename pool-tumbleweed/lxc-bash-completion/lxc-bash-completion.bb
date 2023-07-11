SUMMARY = "Bash Completion for lxc"
DESCRIPTION = "Bash command line completion support for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-bash-completion-5.0.2-1.2.noarch.rpm"
RPM_HASH = "531621b908b2b13225e55652a0c2f7bcec63af9091fa5f9b2cc7eabbcc962e640bec23b10b87e7192f8ebfa155e7d50b4cf1534533462f90e475d7b199990064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-bash-completion"

RDEPENDS:${PN} += "lxc"

inherit rpm
