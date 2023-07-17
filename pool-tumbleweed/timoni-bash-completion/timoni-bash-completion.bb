SUMMARY = "Bash Completion for timoni"
DESCRIPTION = "Bash command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "timoni-bash-completion-0.10.0-1.1.noarch.rpm"
RPM_HASH = "d9a69ad9fe0b5c39247f17f027668d84b736432d85d27b94548ae7969b5639f2f8d927f1b4ef51c4655b1ce998625cbbad094329f0d8c6eb96b2f547a1257abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-bash-completion"

RDEPENDS:${PN} += "bash-completion \
timoni"

inherit rpm
