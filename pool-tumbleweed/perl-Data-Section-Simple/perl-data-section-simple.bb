SUMMARY = "Read data from __DATA__"
DESCRIPTION = "Data::Section::Simple is a simple module to extract data from '__DATA__' \
section of the file."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Data-Section-Simple-0.07-1.28.noarch.rpm"
RPM_HASH = "c7d4a5a3d020167c3bbe1b3557062d55ffd9bc88146ea31ea0165650d2932364165102bea0d83cb99a2e7ca59a9c83bbe310ddada945c2fa79aa93dfdd1cd683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section--Simple \
perl-Data-Section-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
