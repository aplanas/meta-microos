SUMMARY = "Documentation for libxcb"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This subpackage contains the manual pages and documentation for \
libxcb."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-devel-doc-1.15-2.3.noarch.rpm"
RPM_HASH = "fe15ceefac62b82510315e661c68d2ea8132ca97c8ccb18eb541ce36f955b50ab726fabdcda3bdc7c70a8f8131726a66f1b1a24a35deeca7612a99a1c24b0e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxcb-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
