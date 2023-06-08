SUMMARY = "Development files for deadbeef"
DESCRIPTION = "This package provides headers for DeaDBeeF plugins development."
LICENSE = "Zlib"

PV = "1.9.5"

RPM_NAME = "deadbeef-devel-1.9.5-2.1.aarch64.rpm"
RPM_HASH = "34e7dae789024a2ef6f930255f21cf1d8068689932c361cc55cb95aeb2ca13bb9a1107cf1a72849a8967f344a311860e7a17139d760ae0312e694865aad1eb15"

RPROVIDES:${PN} += "deadbeef-devel deadbeef-devel(aarch-64)"
RDEPENDS:${PN} += "deadbeef"

inherit rpm
