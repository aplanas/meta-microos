SUMMARY = "Convert byte count to human readable format"
DESCRIPTION = "THIS IS ALPHA SOFTWARE: THE DOCUMENTATION AND THE CODE WILL SUFFER CHANGES \
SOME DAY (THANKS, GOD!). \
 \
This module provides a formatter which turns byte counts to usual readable \
format, like '2.0K', '3.1G', '100B'. It was inspired in the '-h' option of \
Unix utilities like 'du', 'df' and 'ls' for 'human-readable' output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Number-Bytes-Human-0.11-1.10.noarch.rpm"
RPM_HASH = "b495bf234394c922bef2ad484392bc9903826e89f2a3c662d4ddf221cdb06ef01e2ce6eef2d8dee7d89c5f713ac883e552a927f7e7e1342c984af66263f671f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Bytes--Human \
perl-Number-Bytes-Human"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
