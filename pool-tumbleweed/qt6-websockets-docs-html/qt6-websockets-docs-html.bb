SUMMARY = "Documentation for qt6-websockets in HTML format"
DESCRIPTION = "This package contains documentation for qt6-websockets in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "00015f2693b540422259367fc25631323680b388ff5899a1e61ebaa126d415599de9c275ee78cb881f42f649deaedc27a59c580825646fb3cb6c87c02fb6df08"

RPROVIDES:${PN} += "qt6-websockets-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
