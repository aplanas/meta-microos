SUMMARY = "Development files for chck"
DESCRIPTION = "Development files for Wayland Compositor Library."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "chck-devel-0.0.20161208-1.25.aarch64.rpm"
RPM_HASH = "8f351bc540979e628a473409a0aa727b19e4b01b5495a94a47350d4883da1f627e6742ad8607b8efa701bb65bf547cca88daf37209a8453045bca8e9c3404370"

RPROVIDES:${PN} += "chck-devel chck-devel(aarch-64) pkgconfig(chck)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libchck0"

inherit rpm
