SUMMARY = "Lightning-fast URL fetcher"
DESCRIPTION = "Furl is yet another HTTP client library. LWP is the de facto standard HTTP \
client for Perl 5, but it is too slow for some critical jobs, and too \
complex for weekend hacking. Furl resolves these issues. Enjoy it!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.14"

RPM_NAME = "perl-Furl-3.14-1.10.noarch.rpm"
RPM_HASH = "f633eb8a894b13f7126abd05bf335970a11683bce05ed34dbfd02fa882158d9306b3f679929dd36960a0c7c7815aca84348e1389cd88154c05805a0dc94381c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Furl \
perl-Furl--ConnectionCache \
perl-Furl--HTTP \
perl-Furl--Headers \
perl-Furl--Request \
perl-Furl--Response \
perl-Furl--ZlibStream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Lite \
perl-HTTP--Parser--XS"

inherit rpm
