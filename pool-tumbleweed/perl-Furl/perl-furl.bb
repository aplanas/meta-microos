SUMMARY = "Lightning-fast URL fetcher"
DESCRIPTION = "Furl is yet another HTTP client library. LWP is the de facto standard HTTP \
client for Perl 5, but it is too slow for some critical jobs, and too \
complex for weekend hacking. Furl resolves these issues. Enjoy it!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.14"

RPM_NAME = "perl-Furl-3.14-1.11.noarch.rpm"
RPM_HASH = "41bd3831239578dbfc2c11d8fee9f7af6aebdde1da4fbf001aceb67d431546cc9a3558ccce1b3e7293448b9c35ecd5d4947dba0e73644897c2ff8b13a0c26091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Furl \
perl-Furl--ConnectionCache \
perl-Furl--HTTP \
perl-Furl--Headers \
perl-Furl--Request \
perl-Furl--Response \
perl-Furl--ZlibStream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Lite \
perl-HTTP--Parser--XS"

inherit rpm
