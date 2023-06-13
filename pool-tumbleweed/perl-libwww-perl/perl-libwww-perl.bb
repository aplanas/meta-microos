SUMMARY = "The World-Wide Web library for Perl"
DESCRIPTION = "The World-Wide Web library for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.70"

RPM_NAME = "perl-libwww-perl-6.70-1.1.noarch.rpm"
RPM_HASH = "f920ed263de1efa1be0d9f65742042cca32f9681498d282574abc4b0771bb659e79cf8adeef915d83ff2bf85865eb88e281c1134f58749b60c4e9e63fcadc3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(LWP) \
perl(LWP::Authen::Basic) \
perl(LWP::Authen::Digest) \
perl(LWP::Authen::Ntlm) \
perl(LWP::ConnCache) \
perl(LWP::Debug) \
perl(LWP::Debug::TraceHTTP) \
perl(LWP::DebugFile) \
perl(LWP::MemberMixin) \
perl(LWP::Protocol) \
perl(LWP::Protocol::cpan) \
perl(LWP::Protocol::data) \
perl(LWP::Protocol::file) \
perl(LWP::Protocol::ftp) \
perl(LWP::Protocol::gopher) \
perl(LWP::Protocol::http) \
perl(LWP::Protocol::loopback) \
perl(LWP::Protocol::mailto) \
perl(LWP::Protocol::nntp) \
perl(LWP::Protocol::nogo) \
perl(LWP::RobotUA) \
perl(LWP::Simple) \
perl(LWP::UserAgent) \
perl-libwww-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Encode::Locale) \
perl(File::Listing) \
perl(HTML::Entities) \
perl(HTML::HeadParser) \
perl(HTTP::CookieJar::LWP) \
perl(HTTP::Cookies) \
perl(HTTP::Date) \
perl(HTTP::Negotiate) \
perl(HTTP::Request) \
perl(HTTP::Request::Common) \
perl(HTTP::Response) \
perl(HTTP::Status) \
perl(LWP::MediaTypes) \
perl(Module::Load) \
perl(Net::HTTP) \
perl(Try::Tiny) \
perl(URI) \
perl(URI::Escape) \
perl(WWW::RobotRules) \
perl(parent)"

inherit rpm
