SUMMARY = "Get information about a class and its structure"
DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.36"

RPM_NAME = "perl-Class-Inspector-1.36-1.17.noarch.rpm"
RPM_HASH = "5a80fff9474050d24af7f6ad8d88aa1d5efc9b6cfd7f89751668ebcd34ea14fb1ab2c13d5983865a6e8bbe0c69e6704c825df589245e9cd6b6b69393743ffc40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inspector \
perl-Class--Inspector--Functions \
perl-Class-Inspector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
