SUMMARY = "Create or remove directory trees"
DESCRIPTION = "This module provides a convenient way to create directories of arbitrary \
depth and to delete an entire directory subtree from the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.180000"

RPM_NAME = "perl-File-Path-2.180000-1.12.noarch.rpm"
RPM_HASH = "fb6f95d4a2aef3ac450fecf48406c3aca9c80745f6fac2eeb7ca5a774a4dd0596536e6b19739307d051a98089bc82d4049dc15a2995c32c8bc3db46f9ed94097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Path \
perl-File-Path"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
