SUMMARY = "Command-line tool to run Firecracker microVMs"
DESCRIPTION = "Firectl is a command-line tool to run Firecracker microVMs."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "firectl-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "789784557d692f3b990ff78a1f66e0e759ddad32b46d7f1e0fc55790643988b56f2294e2c6da07e9ebccdf3df34e4d99aa1421df45f57abc5fde134f49d33fc0"

RPROVIDES:${PN} += "firectl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
