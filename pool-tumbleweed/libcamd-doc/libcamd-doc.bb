SUMMARY = "Documentation for libcamd"
DESCRIPTION = "Documentation for libcam."
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "libcamd-doc-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "543f2f00bdd2c11f00d56a672105b8325e1b54527ada53ac13895f0af8f1a1ccd82db0572c805aef844d5ef9aa370b058c27717e002bbbb30f38320a47b9cbdc"

RPROVIDES:${PN} += "libcamd-doc"

RDEPENDS:${PN} += ""

inherit rpm
