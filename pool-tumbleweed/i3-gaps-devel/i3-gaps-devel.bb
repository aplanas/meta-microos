SUMMARY = "Development headers for i3-gaps"
DESCRIPTION = "Development headers for the i3-gaps window manager"
LICENSE = "BSD-3-Clause"

PV = "4.21.1"

RPM_NAME = "i3-gaps-devel-4.21.1-1.3.aarch64.rpm"
RPM_HASH = "2e0ef5d491d2eee312ec9c3bc229510ea194c1c7827530010fb4e231dbd2d1544aaab90a3b2496535cc6923265a500e222106ed56ec144615bee710166316f6f"

RPROVIDES:${PN} += "i3-gaps-devel"

RDEPENDS:${PN} += "i3-gaps"

inherit rpm
