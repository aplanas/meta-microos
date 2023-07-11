SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "pluto-zsh-completion-5.17.0-1.1.noarch.rpm"
RPM_HASH = "f64c429c5fffc584a1d4c6a75fd5be3552228843b101c1e1b9a10edf680d701d6ccb2c88414b9800c1aee75caeeb4799e01d6577580c5080f4823f5600dc6633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
