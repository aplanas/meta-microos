SUMMARY = "Spawn processes but report exec() errors"
DESCRIPTION = "This module contains functions for synchronized process spawning with full \
error return. If the child's exec() call fails the reason for the failure \
is reported back to the parent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Proc-SyncExec-1.01-1.12.noarch.rpm"
RPM_HASH = "7b223a0e3a1e63d0ac343b1280b2436f9b20db4760ce0d65a1fda3f7da4386c8232e3d7143a8d4f7d7571342658350d0434bffcaf91a98cabd76500b9fd2b653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--SyncExec \
perl-Proc-SyncExec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
