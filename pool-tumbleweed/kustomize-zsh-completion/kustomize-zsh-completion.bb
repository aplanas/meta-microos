SUMMARY = "Zsh Completion for kustomize"
DESCRIPTION = "Zsh command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-zsh-completion-4.5.7-1.4.noarch.rpm"
RPM_HASH = "844814e6490dac63322eb7223dd47257ef578816d17a7e5b0370e5e29113af3c0a784301efa652e4c86b35a42618326ee17a20c6105e7680dfea9452b41b9db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-zsh-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm
