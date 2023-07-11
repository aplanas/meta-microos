SUMMARY = "Perl compatibility Library"
DESCRIPTION = "Perl genders API for the most part used exclusively by LLNL. It is compatible with earlier releases of genders."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-perl-compat-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "a9358c93a979f6a4821975aa548e985e528ffeec7cd4db6550d9bf0352f48276d46f5bf9859f27b557df75081c8be54a5fa3635a22b337f8f83aab3397e1e334"

RPROVIDES:${PN} += "genders-perl-compat"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
