SUMMARY = "Zsh Completion for conftest"
DESCRIPTION = "Zsh command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.42.1"

RPM_NAME = "conftest-zsh-completion-0.42.1-1.1.noarch.rpm"
RPM_HASH = "14fd233abdb9b27647a8133f64940c69133ada81f75d03b8e08765167fbd6bd96c572abdc58559a9a5ca5e06eaf0f4e913c48047293249ac3e164a8ecc728ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-zsh-completion"
RDEPENDS:${PN} += "conftest"

inherit rpm
