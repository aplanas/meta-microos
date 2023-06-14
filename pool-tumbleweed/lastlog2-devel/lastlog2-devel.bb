SUMMARY = "Development files for liblastlog2"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read, write or modify the lastlog2 database."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "lastlog2-devel-1.1.0-2.1.aarch64.rpm"
RPM_HASH = "b96a58d697044cae6f06fbe4fea5ab2f88d32f42cf5e9dc2d968b1c70c3fbe7d1fd62e70c8755d822019add3fb58d7a4d258b2d2e690fa347e1e60e9855bbf76"

RPROVIDES:${PN} += "lastlog2-devel \
pkgconfig-liblastlog2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblastlog2-1"

inherit rpm
