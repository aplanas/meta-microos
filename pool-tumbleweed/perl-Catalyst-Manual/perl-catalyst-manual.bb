SUMMARY = "The Catalyst developer's manual"
DESCRIPTION = "The Catalyst developer's manual"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.9011"

RPM_NAME = "perl-Catalyst-Manual-5.9011-1.13.noarch.rpm"
RPM_HASH = "39bb7c252c3c1a1eabbc98e58515d421759bcafe84939bfaabe495de74cf4f4d07c692db7f30843d2515a96e38764c58a55eb6e607aee7d8e643acfb48290f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Catalyst::Manual) \
perl-Catalyst-Manual"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
