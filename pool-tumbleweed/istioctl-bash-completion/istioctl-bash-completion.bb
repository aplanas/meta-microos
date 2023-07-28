SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.1"

RPM_NAME = "istioctl-bash-completion-1.18.1-1.1.noarch.rpm"
RPM_HASH = "5bc5e0b6ab1e6f9e8a0d93c9100acf2c907e5e61b373a9749e8d540c18483da538fdc629c85be94e76cc74e265263e00cdffc34dfa8875bfd047d8774ccd913d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
istioctl"

inherit rpm
