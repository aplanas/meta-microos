SUMMARY = "Development files for liblastlog2"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read, write or modify the lastlog2 database."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "lastlog2-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "038ec52491880954def8167b191fed906261b5a8befc9ea3cb3779141f66c1c1cc59e630a26e616ce117707b31b8a8e5fad56cea60f004b36246a4fac6470036"

RPROVIDES:${PN} += "lastlog2-devel \
pkgconfig-liblastlog2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblastlog2-1"

inherit rpm
