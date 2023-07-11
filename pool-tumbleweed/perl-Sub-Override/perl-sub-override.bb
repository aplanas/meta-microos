SUMMARY = "Perl extension for easily overriding subroutines"
DESCRIPTION = "Perl extension for easily overriding subroutines"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.09"

RPM_NAME = "perl-Sub-Override-0.09-5.28.noarch.rpm"
RPM_HASH = "6697e78654629c99673bc5aa143a40f103ecb02d0c92d55191213e5583b115da908830f17ce1210d2d55bcbe95a62c7e89f3ffa00761b11a5fbbe037dbb557c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Override \
perl-Sub-Override"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Fatal"

inherit rpm
