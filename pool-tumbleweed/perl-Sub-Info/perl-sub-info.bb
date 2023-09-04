SUMMARY = "Tool for inspecting subroutines"
DESCRIPTION = "Tool to inspect subroutines."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Sub-Info-0.002-1.25.noarch.rpm"
RPM_HASH = "aa59979bfe35e652667525df913dafc3633e6d9335dfc2f0d41da7420d8d724db5cec61e388ad2b221ed35773d0907a9faeefc7d5254c0023ae07c4fdc7f4833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Info \
perl-Sub-Info"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Importer"

inherit rpm
