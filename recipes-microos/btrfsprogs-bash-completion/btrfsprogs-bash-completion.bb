SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "bash command line completion support for btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-bash-completion-6.3-1.1.aarch64.rpm"
RPM_HASH = "53e3ae382004d45883888f4bc9c45f8f261c8cd39f2bd4890aecde2e951271e5e84d6dfb6c77e03912fdce526f2d638a0f367e6de31b967803f16019029bbfb1"

RPROVIDES:${PN} += "btrfsprogs-bash-completion \
btrfsprogs-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion \
btrfsprogs"

inherit rpm
