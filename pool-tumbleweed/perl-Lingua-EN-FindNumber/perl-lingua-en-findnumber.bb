SUMMARY = "Locate (written) numbers in English text"
DESCRIPTION = "This module provides a regular expression for finding numbers in English \
text. It also provides functions for extracting and manipulating such \
numbers."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.32"

RPM_NAME = "perl-Lingua-EN-FindNumber-1.32-1.26.noarch.rpm"
RPM_HASH = "5b2b5d0f02ae3dd3c9b438ce8332dcf98b576352237815ccf46de3238460cd66717948ec6d31043441e1b9adcd074664ab2857b60018058c5fef2a0148b74e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--FindNumber \
perl-Lingua-EN-FindNumber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Lingua--EN--Words2Nums"

inherit rpm
