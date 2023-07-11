SUMMARY = "Reference documentation for the Intel Math Kernel Library"
DESCRIPTION = "The reference documentation for the Intel Math Kernel Library can be installed \
with this package."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "onednn-doc-3.0.1-1.3.noarch.rpm"
RPM_HASH = "ac7bfdfcb1e4f122f1627340b00f49cffd1f10ccca83eafca406d4453f9b9148057be5eadf79534c5ae19c5e191b099a06863cc2f4d80b5e1d0ec014c80936f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onednn-doc"

RDEPENDS:${PN} += ""

inherit rpm
