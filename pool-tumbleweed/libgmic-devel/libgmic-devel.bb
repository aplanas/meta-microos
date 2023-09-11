SUMMARY = "Header and library from gmic for use in other C++ projects"
DESCRIPTION = "Header and library from gmic to needed to develop C++ code that \
uses the gmic functionality provided by the gmic library."
LICENSE = "CECILL-2.1"

PV = "3.3.0"

RPM_NAME = "libgmic-devel-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "0c80bb915be3fa6c5fd4b6166de0a8385a64935d19f69cd84a84a246678f64fa0bcdc6c2f079498a5f66a9f95a72b5f9e4dbbb511ebc63b0db6fc742a5c07b1b"

RPROVIDES:${PN} += "libgmic-devel"

RDEPENDS:${PN} += "libgmic3"

inherit rpm
