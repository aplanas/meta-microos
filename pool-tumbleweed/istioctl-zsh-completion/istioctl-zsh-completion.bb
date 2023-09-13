SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "istioctl-zsh-completion-1.19.0-1.1.noarch.rpm"
RPM_HASH = "b24e771b76de7acd64ed48cfddc9a5ca7ee68667dfc5db08dee48de2edeb229728f89f52e3bc8dbc131ebdbb7da0b6ba1a817b7f218206c503edf62fbbc43dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"

RDEPENDS:${PN} += "istioctl"

inherit rpm
