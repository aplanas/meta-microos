SUMMARY = "Alternative interface to File::Find"
DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you to \
build rules which specify the desired files and directories."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-File-Find-Rule-0.34-2.8.noarch.rpm"
RPM_HASH = "670efe4f4a56873913266a083a27a112f8ad952c5551d4a12a8fab35460293f81f63e4011ac46b3e67dcdef182440b6150db88b0b4fa37e028ea671e307c85e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule \
perl-File-Find-Rule"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Number--Compare \
perl-Text--Glob"

inherit rpm
