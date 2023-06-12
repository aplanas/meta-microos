SUMMARY = "Tools to generate delta rpms"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating delta rpm packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230527"

RPM_NAME = "build-mkdrpms-20230527-1.1.noarch.rpm"
RPM_HASH = "90af017d6239103d7a22a0ed1e77d0f086c5003621265e9022bde8e5f30d762ced3425d04cbb1372257ae76fad35ca34292eb95c8d00452f039906d8d46002dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkdrpms"
RDEPENDS:${PN} += "/usr/bin/perl build deltarpm"

inherit rpm
