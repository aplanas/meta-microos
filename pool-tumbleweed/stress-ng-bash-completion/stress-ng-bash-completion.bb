SUMMARY = "Bash Completion for stress-ng"
DESCRIPTION = "Bash completion script for stress-ng."
LICENSE = "GPL-2.0-only"

PV = "0.16.04"

RPM_NAME = "stress-ng-bash-completion-0.16.04-1.1.noarch.rpm"
RPM_HASH = "a7d884efa5bbfe5f1e8f85078b7ca179abddfce12ead6aac75b0b2902d506f6957c6b0e495d0d8e81b272877025418d1587e0963bace937062608cbbcb69584f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stress-ng-bash-completion"

RDEPENDS:${PN} += "bash-completion \
stress-ng"

inherit rpm
