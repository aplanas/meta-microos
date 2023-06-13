SUMMARY = "Rsh compatibility package for mrcp/mrlogin/mrsh"
DESCRIPTION = "This package provides rsh compatibility for mrcp/mrlogin/mrsh"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-rsh-compat-2.12-13.3.aarch64.rpm"
RPM_HASH = "20dcb4b746f21012369fc56627de5f6bc6097ea6fb3eb83915bd066bdd9b94f4a964279ef7024c7088c3efc914af5e86302e743b9b61032f9a7219f22503f66e"

RPROVIDES:${PN} += "mrsh-rsh-compat \
mrsh-rsh-compat(aarch-64) \
rsh"

RDEPENDS:${PN} += "mrsh"

inherit rpm
