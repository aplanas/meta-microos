SUMMARY = "Bash Completion for salt"
DESCRIPTION = "Bash command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-bash-completion-3006.0-2.1.noarch.rpm"
RPM_HASH = "e878de2dfcdeb4337a6b0ea43ecea66e79123a1a7464e7e507977e2b0042fec18f53dc15cc01c1296faa0d7f2918acb5cd24a57d2b53a26d38479257c26976c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-bash-completion \
salt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
salt"

inherit rpm
