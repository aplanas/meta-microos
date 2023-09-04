SUMMARY = "Nested URIs"
DESCRIPTION = "Nested URIs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-URI-Nested-0.10-1.24.noarch.rpm"
RPM_HASH = "c603e59376a8dc1db41d5ea03efb20c44657598c3bd4bf779a1a96d755b66ec85b2558b19594784d0ac624b2177c4d8cdc93b8dea8837a4530a1e68870a42056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Nested \
perl-URI-Nested"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI"

inherit rpm
