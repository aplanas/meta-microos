SUMMARY = "A X11 client Go bindings"
DESCRIPTION = "it is a X11 protocol go language binding."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "deepin-x11-client-0.6.9-1.9.aarch64.rpm"
RPM_HASH = "de0185b77ac951603682c60bb542efa0e04d0deb944b254e2e6a8a077d934c0a136b603bf45e9635bd8ad1c13b122ea81df0fd8b38279a223e248d1f49c8571f"

RPROVIDES:${PN} += "deepin-x11-client"

RDEPENDS:${PN} += ""

inherit rpm
