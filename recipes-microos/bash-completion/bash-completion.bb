SUMMARY = "Programmable Completion for Bash"
DESCRIPTION = " \
 \
 \
 \
bash-completion is a collection of shell functions that take advantage \
of the programmable completion feature of Bash 2.04 and later."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-2.11-7.1.noarch.rpm"
RPM_HASH = "29cad3b075a579473cdd5485bd3b54f702938142419dd31fb984e5b87c0fc642bb645a4633ca11ebc4481c53fa1647d7d8310318f0170394f3c21b58b30a8fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion \
config(bash-completion)"
RDEPENDS:${PN} += "bash"

inherit rpm
