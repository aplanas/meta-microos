SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.115.1"

RPM_NAME = "hugo-bash-completion-0.115.1-1.1.noarch.rpm"
RPM_HASH = "e4b57907bcf412016c9b90c44b8d46b5e48f87918f5504a5991402cda17aef010d44074ee10517e174f78dd9c50bc4e30f48a376999adf254e373833f60277d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
