SUMMARY = "Check for Pod Errors in Files"
DESCRIPTION = "Check POD files for errors or warnings in a test file, using 'Pod::Simple' \
to do the heavy lifting."
LICENSE = "Artistic-2.0 | GPL-2.0-only"

PV = "1.52"

RPM_NAME = "perl-Test-Pod-1.52-1.17.noarch.rpm"
RPM_HASH = "3d1fdcf9e06471a00f2ed40b25342dabf43947f4a1f25bdff636bc51e2ba86540c4f6283fbbceffd2eee46908b694a3cff39c045265ab6566720d70459cd05b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Pod \
perl-Test-Pod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Pod--Simple"

inherit rpm
