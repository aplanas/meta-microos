SUMMARY = "Tools to generate delta rpms"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating delta rpm packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230502"

RPM_NAME = "build-mkdrpms-20230502-1.1.noarch.rpm"
RPM_HASH = "04628644c93b80ff9de62ef2da43795ac966d6ffb8e5464c61c292f82fbaf7c96778cd4437f5858ef2bafd5ebe920bfbba30a7a4c5d5f21437433d88f879ee73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkdrpms"
RDEPENDS:${PN} += "/usr/bin/perl build deltarpm"

inherit rpm
