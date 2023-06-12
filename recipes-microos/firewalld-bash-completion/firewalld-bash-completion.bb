SUMMARY = "Bash Completion for firewalld"
DESCRIPTION = "Bash command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-bash-completion-1.3.2-2.1.noarch.rpm"
RPM_HASH = "befcf1494be671034c5bb31bc95a2991cf9e5eadb6d884e5b5b9845d1516ece7b8effdfb53faf18b26fd106ce842ca80e566cff179407d28d60122cc30030b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-bash-completion"
RDEPENDS:${PN} += "bash-completion firewalld"

inherit rpm
