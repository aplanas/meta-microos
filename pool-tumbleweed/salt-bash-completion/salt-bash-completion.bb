SUMMARY = "Bash Completion for salt"
DESCRIPTION = "Bash command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-bash-completion-3006.0-1.4.noarch.rpm"
RPM_HASH = "422c6341c5a78ddb3e912b2121f05ecb39efefde5a97c83589a772a4d1719f8afaa8f68057816980c64dd37fc4bd6f0fc02662b913ff50df2bac4b98d51d54e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-bash-completion \
salt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
salt"

inherit rpm
