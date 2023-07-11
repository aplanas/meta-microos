SUMMARY = "Javadoc for treelayout"
DESCRIPTION = "This package contains javadoc for treelayout."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-javadoc-1.0.3-3.11.noarch.rpm"
RPM_HASH = "a4f20dd91c2c31b3b939f7056f32342e08677a14f3d723ee946464f03ada78258a82b732ad657c82c09211b5c9abb4116b35463bd15d1d7d4db80e37afa96ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treelayout-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
