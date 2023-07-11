SUMMARY = "Development files for qbs"
DESCRIPTION = "This package is required to develop applications using qbs as a library"
LICENSE = "LGPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "qbs-devel-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "c8192cd785b6764365ebbdbbeb91f97069695270054c0d1a6351f6569f58c78b6b1c572982a0fd7639149fce0a3a07397d6ad4a938d0c9d12d5de513969b1536"

RPROVIDES:${PN} += "qbs-devel"

RDEPENDS:${PN} += "qbs"

inherit rpm
