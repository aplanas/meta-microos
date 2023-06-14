SUMMARY = "Development files for the Low Bandwith X extension routines"
DESCRIPTION = "liblbxutil is a library of routines for LBX (Low Bandwidth X) \
extension support shared between the lbxproxy program and an \
LBX-supporting X server. \
 \
This package contains the development headers for the library found \
in liblbxutil1."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "liblbxutil-devel-1.1.0-13.14.aarch64.rpm"
RPM_HASH = "6f3c871fa2822732d3cd1ee8a3ea709c13b5b7c9ff23617ce05ae08a822de4254cdb930c9cd5a0dc813b45cb7a300a1562f3d60be5b29c0de47628d7641695d3"

RPROVIDES:${PN} += "liblbxutil-devel \
pkgconfig-lbxutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblbxutil1"

inherit rpm
