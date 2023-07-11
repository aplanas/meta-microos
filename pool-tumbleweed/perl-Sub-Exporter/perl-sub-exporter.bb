SUMMARY = "Sophisticated exporter for custom-built routines"
DESCRIPTION = "*ACHTUNG!* If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.989"

RPM_NAME = "perl-Sub-Exporter-0.989-1.3.noarch.rpm"
RPM_HASH = "4ca5b636e066893ba927ec58a64faea83701599af61af59614ae47d53c0348d3097286c843e1fad1ab6c905214fe095775b8bf63dc28d63d1753c34bb4db5330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub-Exporter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--OptList \
perl-Params--Util \
perl-Sub--Install"

inherit rpm
