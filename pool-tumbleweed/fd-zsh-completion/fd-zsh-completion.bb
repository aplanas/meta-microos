SUMMARY = "ZSH Completion for fd"
DESCRIPTION = "The official zsh completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-zsh-completion-8.7.0-1.3.noarch.rpm"
RPM_HASH = "883e814de6382bedbae26f2e417cde4dd230297426b14ff606ed23bb682342739a0e64e37e75f6594a2ab42fed0889a7453f643deb2c0fba8b9e02f6d85c4804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
