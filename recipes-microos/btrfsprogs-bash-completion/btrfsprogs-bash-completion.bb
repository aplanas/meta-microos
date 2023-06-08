SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "bash command line completion support for btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "btrfsprogs-bash-completion-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "bcf43c58d2844da4d00b63aeaa92a08d6577165721b4da40a9ca9530601c53cad560023765902124afca00d059328f79b620569e950f2868e93cd85743ee9b37"

RPROVIDES:${PN} += "btrfsprogs-bash-completion btrfsprogs-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion btrfsprogs"

inherit rpm
