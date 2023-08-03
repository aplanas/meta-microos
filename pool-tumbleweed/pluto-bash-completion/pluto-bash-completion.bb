SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.2"

RPM_NAME = "pluto-bash-completion-5.18.2-1.1.noarch.rpm"
RPM_HASH = "1fbebb6b35f930e7035806732eb282929ad9f88c0ec122117fa7ad9290cb7da118b695ba6120134a4ce560cef1dd38b8b3afc6f7134517591bc3bd2d53b842cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
