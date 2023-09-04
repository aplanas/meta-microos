SUMMARY = "Check for Pod Errors in Files"
DESCRIPTION = "Check POD files for errors or warnings in a test file, using 'Pod::Simple' \
to do the heavy lifting."
LICENSE = "Artistic-2.0 | GPL-2.0-only"

PV = "1.52"

RPM_NAME = "perl-Test-Pod-1.52-1.19.noarch.rpm"
RPM_HASH = "da565cc279e950bcb25688c620c4c65edb5f679295fd20e2423a85551932a3613ba37b2690392f38cdf57ee6d400f159d72c769104ed6eb57a7e3cc608c7877b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Pod \
perl-Test-Pod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Simple"

inherit rpm
