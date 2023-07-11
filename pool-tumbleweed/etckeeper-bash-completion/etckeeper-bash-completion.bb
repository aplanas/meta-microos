SUMMARY = "The bash completion for etckeeper"
DESCRIPTION = "Bash command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-bash-completion-1.18.18-2.3.noarch.rpm"
RPM_HASH = "65e78027d948471ce626b277066aaba29d3f3a99d2f792866e2de1a571d4fffeeb3162018ec5514347e12a33178cbe386f436bafe7b68ee50103c7bd5c2ea30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-bash-completion"

RDEPENDS:${PN} += "bash-completion \
etckeeper"

inherit rpm
