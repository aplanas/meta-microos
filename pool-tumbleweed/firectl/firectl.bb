SUMMARY = "Command-line tool to run Firecracker microVMs"
DESCRIPTION = "Firectl is a command-line tool to run Firecracker microVMs."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "firectl-0.2.0-1.4.aarch64.rpm"
RPM_HASH = "1098a9157b96286433a0e92af31b78cf7ab221b97c5a5fb2eb57f1802ec55567a0173e13ff18e446656ee1762b3d50fc9e3a4ad00358f6e5bfd29a9287458d8f"

RPROVIDES:${PN} += "firectl \
firectl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
