SUMMARY = "Perl extension for merging IPv4 or IPv6 CIDR addresses"
DESCRIPTION = "Faster alternative to Net::CIDR when merging a large number of CIDR address \
ranges. Works for IPv4 and IPv6 addresses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-Net-CIDR-Lite-0.22-1.11.noarch.rpm"
RPM_HASH = "1f6f37cb7bfe47317113cb4db7dc6efb540b7e3b2b9025d1c7309df13855730d52b9a30ff9a5bdf08276cbf702d786cbe9d9a0830c09598d84a644347047aff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Lite \
perl-Net--CIDR--Lite--Span \
perl-Net-CIDR-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
