SUMMARY = "Sophisticated exporter for custom-built routines"
DESCRIPTION = "*ACHTUNG!* If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.990.0"

RPM_NAME = "perl-Sub-Exporter-0.990.0-1.1.noarch.rpm"
RPM_HASH = "a98b0854e4dc21bdecdcb381a4efc82c99fd3294b3847f5e88ea237bea2c7c365b014b0c7f252e7e3dbdc986bb418ba0429efb6d59882bc4a2d7ec670295d941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub-Exporter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--OptList \
perl-Params--Util \
perl-Sub--Install"

inherit rpm
