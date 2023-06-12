SUMMARY = "Documentation for libxcb"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This subpackage contains the manual pages and documentation for \
libxcb."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-devel-doc-1.15-2.2.noarch.rpm"
RPM_HASH = "6c94bc1a2aec50cf8023d004e24bab6ef7f57334a4c35fd7c0458bb98886e9b0b921c111a58c055874fb42744754dc78495e414efe4dcf610a69927a1e3c73a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxcb-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
