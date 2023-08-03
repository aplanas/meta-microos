SUMMARY = "plugin script for snapper"
DESCRIPTION = "Plugin scripts for snapper to handle BLS config files"
LICENSE = "MIT"

PV = "1+git20230727.a0e666f"

RPM_NAME = "sdbootutil-snapper-1+git20230727.a0e666f-1.1.aarch64.rpm"
RPM_HASH = "598db3ed1e93945acfd31a16325fb641f29d13fdcd89abe71180cdc9065c6b871f713a7650f10e972f429412b608ac7f202496dd70573f6590b90c34e57f67bd"

RPROVIDES:${PN} += "sdbootutil-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
btrfsprogs \
sdbootutil \
snapper"

inherit rpm
