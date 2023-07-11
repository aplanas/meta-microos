SUMMARY = "Development tools for ISL"
DESCRIPTION = "Development tools and headers for the ISL."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "isl-devel-0.26-1.3.aarch64.rpm"
RPM_HASH = "90e643a51c320db6d54c52f761b4756c187a086ea0838ad39500c43db8849733c59d64ac7a1974e5fcc74f62fe231f0e5e4c235f620ddd2299f1ef0ae4be82cf"

RPROVIDES:${PN} += "isl-devel \
pkgconfig-isl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisl23"

inherit rpm
