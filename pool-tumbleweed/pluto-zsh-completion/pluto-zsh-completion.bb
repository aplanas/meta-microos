SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.2"

RPM_NAME = "pluto-zsh-completion-5.18.2-1.1.noarch.rpm"
RPM_HASH = "43b9fd39709bfa703520f226933e8d9df9270a8d55d3ffaaf640f7cb60cd0388f201c0569dfdf71ac0a315156e03ac71613766c9137184c082b5e238352d09f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
