SUMMARY = "Development files for the Neko virtual machine"
DESCRIPTION = "Development files and headers for the Neko virtual machine."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "neko-devel-2.3.0-3.1.aarch64.rpm"
RPM_HASH = "5151e9e80b4ddedca5552bf6c8eab3f7f5effd496b0dbca24bd1380f1987d8df21fe7dda8004b9fa84a9f9476df4c845cf1839ae4216e32c3b9a98c1aa52d3ad"

RPROVIDES:${PN} += "cmake(Neko) \
neko-devel \
neko-devel(aarch-64) \
nekovm-devel"
RDEPENDS:${PN} += "libneko2"

inherit rpm
