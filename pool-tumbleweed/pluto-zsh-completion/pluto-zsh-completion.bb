SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.4"

RPM_NAME = "pluto-zsh-completion-5.16.4-1.1.noarch.rpm"
RPM_HASH = "9db19b68036120e340fba6ad71b5dfe4bf034ccfc0a2ff13d42c03dfb3f5257f19e2ea4f29cf7ed07c054de31d4dc755d55dac1fd2846164246c5aa3516a3caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"
RDEPENDS:${PN} += "pluto"

inherit rpm
