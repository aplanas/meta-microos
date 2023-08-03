SUMMARY = "Bash Completion for weave-gitops"
DESCRIPTION = "Bash command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.28.0"

RPM_NAME = "weave-gitops-bash-completion-0.28.0-1.1.noarch.rpm"
RPM_HASH = "83ea46e03a28f65af0348e14340adf6d8f17013ec75d85c728a1e0faaf2745ffab4f8ab71e2fad6a855d81f2afc8dd61f473d289613c78e5ef22f840fb68cfae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-bash-completion"

RDEPENDS:${PN} += "bash-completion \
weave-gitops"

inherit rpm
