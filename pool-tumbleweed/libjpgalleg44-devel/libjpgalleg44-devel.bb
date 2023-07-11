SUMMARY = "Development files for JPGAlleg"
DESCRIPTION = "This package is needed to build programs that use JPGAlleg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg44-devel-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "9435bf4a1ffc1d2506b7c4b1eec859faef2a884d2849d4148b0d41f43b0cc50f4aa903fd4872cc80af12b14d42091c6ab8f44c07983cf7b2c6f5af97962bad68"

RPROVIDES:${PN} += "libjpgalleg-devel \
libjpgalleg44-devel \
pkgconfig-jpgalleg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpgalleg4-4 \
pkgconfig-allegro"

inherit rpm
