SUMMARY = "Convert byte count to human readable format"
DESCRIPTION = "THIS IS ALPHA SOFTWARE: THE DOCUMENTATION AND THE CODE WILL SUFFER CHANGES \
SOME DAY (THANKS, GOD!). \
 \
This module provides a formatter which turns byte counts to usual readable \
format, like '2.0K', '3.1G', '100B'. It was inspired in the '-h' option of \
Unix utilities like 'du', 'df' and 'ls' for 'human-readable' output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Number-Bytes-Human-0.11-1.9.noarch.rpm"
RPM_HASH = "30b570fd8778291d05eedc9179657cc88ebe6830b02276ff3ebaa63747db74b4a4ac2ded3aab6c56ce1cee8ba062f9362a18da1491044a117c5abdc822b65127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Bytes--Human \
perl-Number-Bytes-Human"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
