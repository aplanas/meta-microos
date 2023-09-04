SUMMARY = "Locate (written) numbers in English text"
DESCRIPTION = "This module provides a regular expression for finding numbers in English \
text. It also provides functions for extracting and manipulating such \
numbers."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.32"

RPM_NAME = "perl-Lingua-EN-FindNumber-1.32-1.27.noarch.rpm"
RPM_HASH = "c5d104517a28085397c0f0dcec892a82213f1a0e4b3f2b4119671a9f145a23e0238512573e231ed3d3d32a03e218cc580358fb17616a4e2182c182db9d7d3d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--FindNumber \
perl-Lingua-EN-FindNumber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--EN--Words2Nums"

inherit rpm
