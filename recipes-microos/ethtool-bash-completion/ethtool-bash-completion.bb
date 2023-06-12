SUMMARY = "Bash completion for ethtool"
DESCRIPTION = "bash command line completion support for ethtool."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "ethtool-bash-completion-6.3-1.1.aarch64.rpm"
RPM_HASH = "45588043233828b7c1e053e7c01aaeac81afc4590a4a367cc57ab6fe5259515566e3cfcd3e7621749a55c4d60cdcdc22e5a8a9bea447ed59510a2e202c241b6f"

RPROVIDES:${PN} += "ethtool-bash-completion \
ethtool-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion \
ethtool"

inherit rpm
