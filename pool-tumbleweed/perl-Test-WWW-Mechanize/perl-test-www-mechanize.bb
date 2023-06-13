SUMMARY = "Testing-specific WWW::Mechanize subclass"
DESCRIPTION = "Testing-specific WWW::Mechanize subclass"
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-Test-WWW-Mechanize-1.60-1.2.noarch.rpm"
RPM_HASH = "d765871e486c4882029b0d00833b34a33cef7bd2bd6c2979384316043945311b39a30afbaef98dd9168455e48790e0e8dc73fd21b5e92bf4bf4073205035663c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::WWW::Mechanize) \
perl-Test-WWW-Mechanize"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Carp::Assert::More) \
perl(HTML::Form) \
perl(HTML::TokeParser) \
perl(HTTP::Message) \
perl(LWP) \
perl(Test::LongString) \
perl(WWW::Mechanize) \
perl(parent)"

inherit rpm
