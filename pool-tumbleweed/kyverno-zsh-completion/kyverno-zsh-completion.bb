SUMMARY = "Zsh Completion for kyverno"
DESCRIPTION = "zsh command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kyverno-zsh-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "9c6381a1bb179ae4eb7c08dcaaf17f4c22b6b187e859861f7745fce719ed85df7e91cec0288de6eb13aa41eaf4e67605480216c243b0dedba51c38a670dd4866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-zsh-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
