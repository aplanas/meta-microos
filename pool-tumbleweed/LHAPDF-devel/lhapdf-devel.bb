SUMMARY = "Development files for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the header and source files for development with \
LHAPDF."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "LHAPDF-devel-6.5.4-1.2.aarch64.rpm"
RPM_HASH = "18d8e40ac9edd08332a5fb0e5d43197535960e74b5d2d4d13ea34d9fb295be4f93c9d6f49b15244da59279a43a4257bdd6c820a4207ff7d7fc3a4d863aef7b0a"

RPROVIDES:${PN} += "LHAPDF-devel \
pkgconfig-lhapdf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3 \
libLHAPDF-6-5-4"

inherit rpm
