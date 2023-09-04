SUMMARY = "Perl extension for merging IPv4 or IPv6 CIDR addresses"
DESCRIPTION = "Faster alternative to Net::CIDR when merging a large number of CIDR address \
ranges. Works for IPv4 and IPv6 addresses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-Net-CIDR-Lite-0.22-1.12.noarch.rpm"
RPM_HASH = "c5c04fe14c026a2a7b2bc1751c1cc15fcaadabd9c77615cdd16ddbdc7acb486e76163b83f02982795f28d34b5811dcc67f15c13253b060e13d6af8cb6bd58c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Lite \
perl-Net--CIDR--Lite--Span \
perl-Net-CIDR-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
