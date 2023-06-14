SUMMARY = "Read multiple hunks of data out of your DATA section"
DESCRIPTION = "Data::Section provides an easy way to access multiple named chunks of \
line-oriented data in your module's DATA section. It was written to allow \
modules to store their own templates, but probably has other uses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200008"

RPM_NAME = "perl-Data-Section-0.200008-1.2.noarch.rpm"
RPM_HASH = "936cca03cbef67d049c2bcea6ac5fbfdcc91672571b5884d4e19db4c4616eb96e7d9592337fc084a9feeaf64da6498df122673a05ad5605fec7cf620c763f835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section \
perl-Data-Section"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-MRO--Compat \
perl-Sub--Exporter"

inherit rpm
