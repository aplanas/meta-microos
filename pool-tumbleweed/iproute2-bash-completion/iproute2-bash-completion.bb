SUMMARY = "Bash completion for iproute"
DESCRIPTION = "bash command line completion support for iproute."
LICENSE = "GPL-2.0-or-later"

PV = "6.3"

RPM_NAME = "iproute2-bash-completion-6.3-1.2.aarch64.rpm"
RPM_HASH = "58b492145005ddbcb379ff62e3a1607a6e49212cb06a43a9a12d55ce39d8dd7b0f750e5b06cab258c1596b9dee3e2988e5822872e614828bf4ec78ed715443c9"

RPROVIDES:${PN} += "iproute2-bash-completion"

RDEPENDS:${PN} += "bash-completion \
iproute2"

inherit rpm
