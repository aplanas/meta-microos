SUMMARY = "RPM dependency generator for Perl"
DESCRIPTION = "Provides and requires generator for .pl files and modules."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-perl-4.18.0-5.3.aarch64.rpm"
RPM_HASH = "4d0b91ca3d8a94b31f4584fbcd8b44dc60d8891548fa0eab56e14797d34059edc9afb2967d08f678c0167bc1f18cc5bb74158a2c694815f8a3f77f9fd97b20f1"

RPROVIDES:${PN} += "rpm-build-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
