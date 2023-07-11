SUMMARY = "Development tools for dwayland"
DESCRIPTION = "The dwayland-devel package contains the header files and developer docs for \
dwayland."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "dwayland-devel-5.24.3-1.4.aarch64.rpm"
RPM_HASH = "81f133ff6fc2d6b497186ef6a12df0e74d997940628da32354c7fe2c097f0c275fcd9d627cd7e309b5b06b949a4cd264eae853552e74b92759e076e56dee3c2b"

RPROVIDES:${PN} += "cmake-DWayland \
dwayland-devel"

RDEPENDS:${PN} += "libDWaylandClient5 \
libDWaylandServer5"

inherit rpm
