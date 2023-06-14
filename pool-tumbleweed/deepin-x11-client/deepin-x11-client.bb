SUMMARY = "A X11 client Go bindings"
DESCRIPTION = "it is a X11 protocol go language binding."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "deepin-x11-client-0.6.9-1.8.aarch64.rpm"
RPM_HASH = "520cb1cd8bd3983d1c43f5adc35a0294940b4f0f693510337f1f08bb97dfc6aba49e4c2d5c76482216ea096585fb9bd8f10e52a2d8f25b1f29ab045694a3420f"

RPROVIDES:${PN} += "deepin-x11-client"

RDEPENDS:${PN} += ""

inherit rpm
