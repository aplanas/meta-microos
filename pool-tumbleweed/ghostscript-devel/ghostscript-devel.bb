SUMMARY = "Development files for Ghostscript"
DESCRIPTION = "This package contains the development files for Ghostscript."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-devel-9.56.1-4.1.aarch64.rpm"
RPM_HASH = "2fc2aafba355c0671a912fd1ac0fd750e4e1a1d98c00f2e037681dc71fe5c1a472c635493f4d3c86883a993d514c0bcd7099a7bc187de9c878494ed525a77a0e"

RPROVIDES:${PN} += "ghostscript-devel \
pkgconfig-ijs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript"

inherit rpm
