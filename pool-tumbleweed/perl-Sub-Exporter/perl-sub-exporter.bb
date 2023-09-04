SUMMARY = "Sophisticated exporter for custom-built routines"
DESCRIPTION = "*ACHTUNG!* If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.990.0"

RPM_NAME = "perl-Sub-Exporter-0.990.0-1.2.noarch.rpm"
RPM_HASH = "90ae486309e104635974528f14d21b5ec1dabcb9f39e9ff0946d8bc5c9ed6bd3579a4cb3255d0a3de914b9ebf123c5b4355464e5faf5666b7a552674585366f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub-Exporter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--OptList \
perl-Params--Util \
perl-Sub--Install"

inherit rpm
