SUMMARY = "Development files for Simplified C Client Interface for PostgreSQL"
DESCRIPTION = "LIBPGEASY is a simplified C interface that hides some of the complexity \
of LIBPQ. \
 \
This subpackage contains the headers for libcec."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "libpgeasy-devel-3.0.4-203.25.aarch64.rpm"
RPM_HASH = "4c607eb8ec2f192c93a0c5c10c6a3958548b9e194dbf81c004f74023c233700f61d4b22b1f5c16410457ddd1d02334c26a8d88ea71177fe41eabcae0a8f648b2"

RPROVIDES:${PN} += "libpgeasy-devel"

RDEPENDS:${PN} += "libpgeasy3"

inherit rpm
