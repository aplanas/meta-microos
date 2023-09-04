SUMMARY = "Read data from __DATA__"
DESCRIPTION = "Data::Section::Simple is a simple module to extract data from '__DATA__' \
section of the file."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Data-Section-Simple-0.07-1.29.noarch.rpm"
RPM_HASH = "7895566a73962b7c9ae0587f5c8018beabd3e7ba13fd604f0d3cae38eb658bb0e3d672df3afb9a1c4542ad130470a8dd03a5d5ee5bd59f03cf4c8a36a2973da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section--Simple \
perl-Data-Section-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
