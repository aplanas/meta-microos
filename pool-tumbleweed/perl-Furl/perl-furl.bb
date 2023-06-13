SUMMARY = "Lightning-fast URL fetcher"
DESCRIPTION = "Furl is yet another HTTP client library. LWP is the de facto standard HTTP \
client for Perl 5, but it is too slow for some critical jobs, and too \
complex for weekend hacking. Furl resolves these issues. Enjoy it!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.14"

RPM_NAME = "perl-Furl-3.14-1.9.noarch.rpm"
RPM_HASH = "b11982c0b097af1ea6eeb5e1fbe8d888e2be27ace0554335de602df83594a69a18132d117e8b95dc3b41f29ab5e54cc75aadd3c4dc1d2468a65bfd7d0abed62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Furl) \
perl(Furl::ConnectionCache) \
perl(Furl::HTTP) \
perl(Furl::Headers) \
perl(Furl::Request) \
perl(Furl::Response) \
perl(Furl::ZlibStream) \
perl-Furl"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor::Lite) \
perl(HTTP::Parser::XS)"

inherit rpm
