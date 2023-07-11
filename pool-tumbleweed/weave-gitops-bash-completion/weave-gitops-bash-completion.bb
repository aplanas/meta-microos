SUMMARY = "Bash Completion for weave-gitops"
DESCRIPTION = "Bash command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.27.0"

RPM_NAME = "weave-gitops-bash-completion-0.27.0-1.1.noarch.rpm"
RPM_HASH = "6b88fb78b0c960c136a8eb9f59dd777821161b4fd895d02bae39d06f08acc2a23e1b126f1543600b316d7a562dc0a5947006ea04c1392e7c5d5334dcdbe12e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-bash-completion"

RDEPENDS:${PN} += "bash-completion \
weave-gitops"

inherit rpm
