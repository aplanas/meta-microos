SUMMARY = "Interface to URL shortening sites"
DESCRIPTION = "A Perl interface to various services that shorten URLs. These sites \
maintain databases of long URLs, each of which has a unique identifier."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.094"

RPM_NAME = "perl-WWW-Shorten-3.094-1.10.noarch.rpm"
RPM_HASH = "2198fd39e49301fa155b8e3949a0f51c3ee2634dede403fea8ff565cd4a6282ea8b56317e42c940c01993a3e7611eca37b67f5996baee572ba233c9c75ff8f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(WWW::Shorten) \
perl(WWW::Shorten::LinkToolbot) \
perl(WWW::Shorten::Linkz) \
perl(WWW::Shorten::MakeAShorterLink) \
perl(WWW::Shorten::Metamark) \
perl(WWW::Shorten::Qurl) \
perl(WWW::Shorten::Qwer) \
perl(WWW::Shorten::TinyClick) \
perl(WWW::Shorten::TinyURL) \
perl(WWW::Shorten::Tinylink) \
perl(WWW::Shorten::UserAgent) \
perl(WWW::Shorten::_dead) \
perl(WWW::Shorten::generic) \
perl-WWW-Shorten"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Getopt::Long) \
perl(LWP::UserAgent) \
perl(Try::Tiny)"

inherit rpm
