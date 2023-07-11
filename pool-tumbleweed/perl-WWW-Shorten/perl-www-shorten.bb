SUMMARY = "Interface to URL shortening sites"
DESCRIPTION = "A Perl interface to various services that shorten URLs. These sites \
maintain databases of long URLs, each of which has a unique identifier."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.094"

RPM_NAME = "perl-WWW-Shorten-3.094-1.11.noarch.rpm"
RPM_HASH = "0c9a5f98f83b51922576a1bec6a7f172628c0a15263ea29c42bbd99aec04d48663f3d00915b84fbaef646dedbec69bfd22d56ea122483ec1f60701ebf1180ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Shorten \
perl-WWW--Shorten---dead \
perl-WWW--Shorten--LinkToolbot \
perl-WWW--Shorten--Linkz \
perl-WWW--Shorten--MakeAShorterLink \
perl-WWW--Shorten--Metamark \
perl-WWW--Shorten--Qurl \
perl-WWW--Shorten--Qwer \
perl-WWW--Shorten--TinyClick \
perl-WWW--Shorten--TinyURL \
perl-WWW--Shorten--Tinylink \
perl-WWW--Shorten--UserAgent \
perl-WWW--Shorten--generic \
perl-WWW-Shorten"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long \
perl-LWP--UserAgent \
perl-Try--Tiny"

inherit rpm
