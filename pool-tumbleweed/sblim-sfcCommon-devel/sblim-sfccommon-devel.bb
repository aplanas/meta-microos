SUMMARY = "Library of utility functions shared between sfcb and sfcc"
DESCRIPTION = "This package provides development files to compile and link against \
libsblim-sfccommon."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "sblim-sfcCommon-devel-1.0.1-3.25.aarch64.rpm"
RPM_HASH = "7affe0bd76cebbed7c5a470796a1e07a250f3807fbd90829a2ec41cf6a8593628c66b0c004fb886de338e638ffa435a4e8c36241700fdada7a139fad1be0fe1f"

RPROVIDES:${PN} += "sblim-sfcCommon-devel"

RDEPENDS:${PN} += "libsfcUtil0 \
pkg-config \
sblim-cmpi-devel"

inherit rpm
