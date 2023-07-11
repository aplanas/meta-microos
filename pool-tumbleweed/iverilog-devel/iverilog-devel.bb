SUMMARY = "Icarus Verilog development files"
DESCRIPTION = "This package contains necessary header files for Icarus Verilog"
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "iverilog-devel-11.0-1.12.aarch64.rpm"
RPM_HASH = "3a1dd4f7126ba1fe8212d08fe756f7011d11a6b2d1d9ba460edd7da00d3f602eedf99bd557a9f97d764b981a40e12ecf99f8ff512e326126198568fd976dfc69"

RPROVIDES:${PN} += "iverilog-devel"

RDEPENDS:${PN} += "iverilog"

inherit rpm
