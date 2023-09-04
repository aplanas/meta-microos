SUMMARY = "RPM dependency generator for Perl"
DESCRIPTION = "Provides and requires generator for .pl files and modules."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-perl-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "5755c00435c6b0fa1e61f1f5da49dd95d1615587944e6c2b2e4f3bee98f29140831b148f154fa306419c466da102632f01902e65242090a9ed5b0ec08de0ad54"

RPROVIDES:${PN} += "rpm-build-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
