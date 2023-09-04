SUMMARY = "Interface to URL shortening sites"
DESCRIPTION = "A Perl interface to various services that shorten URLs. These sites \
maintain databases of long URLs, each of which has a unique identifier."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.094"

RPM_NAME = "perl-WWW-Shorten-3.094-1.12.noarch.rpm"
RPM_HASH = "a2e521489cad38e6e053f2c2faf18153e0fa6d0b6c0bd267574fa8536e10d81380edbd5b452b087d149ac8468f611b6188f91d457c3fd757c5ec24666efc8fc0"
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
perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long \
perl-LWP--UserAgent \
perl-Try--Tiny"

inherit rpm
