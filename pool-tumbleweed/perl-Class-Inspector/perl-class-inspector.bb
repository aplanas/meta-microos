SUMMARY = "Get information about a class and its structure"
DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.36"

RPM_NAME = "perl-Class-Inspector-1.36-1.16.noarch.rpm"
RPM_HASH = "00888ec55924318fa80a732c99bea44f3f78a0f69d6f58f0981916b1ebebf0c19575a5fb2d57040dcbd2c5484cf64e9c46498795bbbf431249faba22d9a94f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inspector \
perl-Class--Inspector--Functions \
perl-Class-Inspector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
