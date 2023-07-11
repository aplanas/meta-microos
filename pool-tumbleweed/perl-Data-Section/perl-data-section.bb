SUMMARY = "Read multiple hunks of data out of your DATA section"
DESCRIPTION = "Data::Section provides an easy way to access multiple named chunks of \
line-oriented data in your module's DATA section. It was written to allow \
modules to store their own templates, but probably has other uses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200008"

RPM_NAME = "perl-Data-Section-0.200008-1.3.noarch.rpm"
RPM_HASH = "bef478bfab386be7cfb3698f85e1d1fb66027ee298458606e22e8be562d1919cc1c97f81229c44eeaaa888c7263b4bfb8e7c122a79d98e6b5ca6a0b71b1b3b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section \
perl-Data-Section"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MRO--Compat \
perl-Sub--Exporter"

inherit rpm
