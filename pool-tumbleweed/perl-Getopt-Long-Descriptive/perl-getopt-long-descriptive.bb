SUMMARY = "Getopt::Long, but simpler and more powerful"
DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built atop \
Getopt::Long, and gets a lot of its features, but tries to avoid making you \
think about its huge array of options. \
 \
It also provides usage (help) messages, data validation, and a few other \
useful features."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Getopt-Long-Descriptive-0.111-1.3.noarch.rpm"
RPM_HASH = "139c88c4325a636ce356ba41a9dcd7866902011a49d9e4ad74364f08696756b1af744fd533256ee9ef19bf9c6aba9561de11440b1a10d145e0093231417b4046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Getopt--Long--Descriptive \
perl-Getopt--Long--Descriptive--Opts \
perl-Getopt--Long--Descriptive--Usage \
perl-Getopt-Long-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Validate \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
