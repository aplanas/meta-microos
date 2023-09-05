SUMMARY = "Samples for xom"
DESCRIPTION = "This package provides Samples for xom."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-demo-1.3.9-1.1.noarch.rpm"
RPM_HASH = "add4b85e1359b265b356e74e995df8d28edb7b793f3d1d2d854fc0f8271d18bdf368a07e288a029e2387be674a42fe24301306d8bd26dbbd0259dc5b1799ae51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xom-demo"

RDEPENDS:${PN} += "xom"

inherit rpm
