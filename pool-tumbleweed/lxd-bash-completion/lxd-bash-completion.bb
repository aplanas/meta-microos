SUMMARY = "Bash Completion for lxd"
DESCRIPTION = "Bash command line completion support for lxd."
LICENSE = "Apache-2.0"

PV = "5.13"

RPM_NAME = "lxd-bash-completion-5.13-1.1.noarch.rpm"
RPM_HASH = "cc340e6168093ad99a41268114da648199d132723384d30be2894eafe4fd64380f3eb42d12ec7aeff91746d622d8bd62e0c3895be1f0aba180958078e7acb6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-bash-completion"

RDEPENDS:${PN} += "lxd"

inherit rpm
