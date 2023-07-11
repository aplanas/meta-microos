SUMMARY = "Zsh Completion for yq"
DESCRIPTION = "Zsh command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-zsh-completion-4.33.3-1.3.noarch.rpm"
RPM_HASH = "75a44fb1afb807e17cc61c34ed8b9bbee5fcb028eabaf50418981956fa02a0da5aa82a1bd36acf1bca7e5444ed8c1f556b149d39dad67c950683a93b544d09d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-zsh-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
