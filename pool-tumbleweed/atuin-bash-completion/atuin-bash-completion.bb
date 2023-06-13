SUMMARY = "Bash completion for atuin"
DESCRIPTION = "Bash command line completion support for atuin."
LICENSE = "MIT"

PV = "14.0.1"

RPM_NAME = "atuin-bash-completion-14.0.1-1.1.noarch.rpm"
RPM_HASH = "ebbc022336be80714889db3a02ec6c8d6fb15f4053e601cdf182b5eecd7bf46c173879ee69644303d9f3751f349112780da2769642f5bee7b56c47037469f17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-bash-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
