SUMMARY = "Spawn processes but report exec() errors"
DESCRIPTION = "This module contains functions for synchronized process spawning with full \
error return. If the child's exec() call fails the reason for the failure \
is reported back to the parent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Proc-SyncExec-1.01-1.13.noarch.rpm"
RPM_HASH = "1b8a3b43f13076bae6763a3f0da2a7101cf140cb5f8fb6d27e49c794a4d93b3c2e306cd2835177962d72d3a4a34cef463fe4f13ae3845745898d6bceae379260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--SyncExec \
perl-Proc-SyncExec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
