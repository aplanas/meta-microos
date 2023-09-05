SUMMARY = "Documentation for libxcb"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This subpackage contains the manual pages and documentation for \
libxcb."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-devel-doc-1.16-1.1.noarch.rpm"
RPM_HASH = "6d9b74524409c32443b742412fe1492bb87959daf915a6eab0112ad6ea986b12761aa8173574a5c0dbdace10bc98afdd686d616eba768fec52d1c33e06e2c730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxcb-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
