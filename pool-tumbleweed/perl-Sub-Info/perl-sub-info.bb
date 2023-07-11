SUMMARY = "Tool for inspecting subroutines"
DESCRIPTION = "Tool to inspect subroutines."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Sub-Info-0.002-1.24.noarch.rpm"
RPM_HASH = "234d6f601e81e8fa18dd948a01bec8f599f2bfa62f4c0d3eca0cca76493661422dd1ba8629d2dae46c00d9e6f4c64e51b8cc7365f3205146c4e5c5329d38e0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Info \
perl-Sub-Info"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Importer"

inherit rpm
