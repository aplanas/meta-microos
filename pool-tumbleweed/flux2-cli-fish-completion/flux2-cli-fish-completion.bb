SUMMARY = "Fish Completion for flux2-cli"
DESCRIPTION = "Fish command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0~rc4"

RPM_NAME = "flux2-cli-fish-completion-2.0.0~rc4-1.1.noarch.rpm"
RPM_HASH = "67ac95210d8b7d42f7adb2052620a2393407e10ea09b1c9010cb774b673bbd1fb0ac20942bc86567815cdc83b59202ccf7f5cdc426aa2ae288fddec5c13195a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-fish-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
