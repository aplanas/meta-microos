SUMMARY = "Development files for mimetic"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use mimetic."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic-devel-0.9.8-3.9.aarch64.rpm"
RPM_HASH = "edea36c4cedafc378048d17a1f0cd00f2c3e47ac3af0b63e8b1b39f7689a8363e038c91fe784212fda7e8e801c0688a8c399b2da0f0364a8e8c0ed5e5173fbec"

RPROVIDES:${PN} += "libmimetic-devel"

RDEPENDS:${PN} += "libmimetic0"

inherit rpm
