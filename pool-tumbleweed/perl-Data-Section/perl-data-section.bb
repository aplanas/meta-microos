SUMMARY = "Read multiple hunks of data out of your DATA section"
DESCRIPTION = "Data::Section provides an easy way to access multiple named chunks of \
line-oriented data in your module's DATA section. It was written to allow \
modules to store their own templates, but probably has other uses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200008"

RPM_NAME = "perl-Data-Section-0.200008-1.4.noarch.rpm"
RPM_HASH = "c4394a321c2e479b3f1a3d7b9436ddced3e7d53b2ccddb100c223b4c2381e5c77890505a88444ff0573190aaaab0d9b9aafc1c2dedffa6d03a10a0316dec10e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section \
perl-Data-Section"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MRO--Compat \
perl-Sub--Exporter"

inherit rpm
