SUMMARY = "Bash Completion for patool"
DESCRIPTION = "This package contains bash completion for patool, a portable command line \
archive file manager."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "patool-bash-completion-1.12-2.7.noarch.rpm"
RPM_HASH = "03c7e19ab78fd026785dfc28bbbd0a0658e1448c74a0dc4bf3ee64dd9e7e7b61c5f55a700b275cc85fc5bc7f33fa958229d07dd09245fb4cef3d65088a18b134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patool-bash-completion"

RDEPENDS:${PN} += "bash-completion \
patool"

inherit rpm
