SUMMARY = "Perl compatibility Library"
DESCRIPTION = "Perl genders API for the most part used exclusively by LLNL. It is compatible with earlier releases of genders."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-perl-compat-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "daca81bf0e32dd1e00eab74cec6c762c1cadfb7d15a13b7be81608f892280e22c5ca6a32d311fcc88100810e46a4c38c2f99b4a64bb97f73f3bc39b770f6f0c6"

RPROVIDES:${PN} += "genders-perl-compat"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
