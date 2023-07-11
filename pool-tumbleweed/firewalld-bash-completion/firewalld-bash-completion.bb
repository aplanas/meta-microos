SUMMARY = "Bash Completion for firewalld"
DESCRIPTION = "Bash command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-bash-completion-2.0.0-1.1.noarch.rpm"
RPM_HASH = "05471b30ff5a0662cb0c73dcd521312b2b6849ce502f3085746b096f19a95ee38ba1e0f0dbedcb6ba58b945e020252f54a65d3e61d0b008a2968ec7d7fd2c77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-bash-completion"

RDEPENDS:${PN} += "bash-completion \
firewalld"

inherit rpm
