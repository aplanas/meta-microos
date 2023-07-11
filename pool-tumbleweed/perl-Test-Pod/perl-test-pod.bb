SUMMARY = "Check for Pod Errors in Files"
DESCRIPTION = "Check POD files for errors or warnings in a test file, using 'Pod::Simple' \
to do the heavy lifting."
LICENSE = "Artistic-2.0 | GPL-2.0-only"

PV = "1.52"

RPM_NAME = "perl-Test-Pod-1.52-1.18.noarch.rpm"
RPM_HASH = "4368cdefc7a19d5175a589e22af194e3556d5a761e56d3b7f92fb1a0e38ed7e6fec5204a7867b31983279f9dc48a14e68d5645f798a8c712eb525fadb2614cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Pod \
perl-Test-Pod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Simple"

inherit rpm
