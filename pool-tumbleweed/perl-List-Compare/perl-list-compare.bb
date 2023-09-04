SUMMARY = "Compare elements of two or more lists"
DESCRIPTION = "Compare elements of two or more lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.55"

RPM_NAME = "perl-List-Compare-0.55-1.14.noarch.rpm"
RPM_HASH = "ccf37b36faa63c6e93543090cbb1e690ee88ab4ba06954c6bceb0bdbddb2c4a8ce2b3f9b290ba45e0b62011dd17049c1c77037a1d92f9b49df5e7f97a7e30f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--Compare \
perl-List--Compare--Accelerated \
perl-List--Compare--Base---Auxiliary \
perl-List--Compare--Base---Engine \
perl-List--Compare--Functional \
perl-List--Compare--Multiple \
perl-List--Compare--Multiple--Accelerated \
perl-List-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
