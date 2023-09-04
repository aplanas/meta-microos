SUMMARY = "Perl compatibility Library"
DESCRIPTION = "Perl genders API for the most part used exclusively by LLNL. It is compatible with earlier releases of genders."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-perl-compat-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "db58116ef4c5e97f0e2a616bc5569b02f0f4219821841fa24af844f93c8a59b0e31721170f53200cf1bd668e444fc1c61582b0f79f6f52fdca5c62d116034e54"

RPROVIDES:${PN} += "genders-perl-compat"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
