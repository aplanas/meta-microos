SUMMARY = "Development files for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the header and source files for development with \
LHAPDF."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "LHAPDF-devel-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "fa3f9a6e63e7b3dd69b50aff26db06853e2f867eb67d9f11d0bc7ad4b2f6345b2b4141e76ce9966c3afb83b9873a1be7c91b5f9e9a1c3f1720c0b5adf0e3d23a"

RPROVIDES:${PN} += "LHAPDF-devel \
pkgconfig-lhapdf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3 \
libLHAPDF-6-5-4"

inherit rpm
