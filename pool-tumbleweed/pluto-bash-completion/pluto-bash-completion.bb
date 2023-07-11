SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "pluto-bash-completion-5.17.0-1.1.noarch.rpm"
RPM_HASH = "50bdc73a56f04b4575c5dd1fabcce0d04b2e3e6e8c14abdec2af455406b7208c2a95a05b5e6970f789209588ec4356e335f59bcf2812a502c3cd3ac73a5018a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
