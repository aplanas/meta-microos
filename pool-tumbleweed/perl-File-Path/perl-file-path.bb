SUMMARY = "Create or remove directory trees"
DESCRIPTION = "This module provides a convenient way to create directories of arbitrary \
depth and to delete an entire directory subtree from the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.180000"

RPM_NAME = "perl-File-Path-2.180000-1.13.noarch.rpm"
RPM_HASH = "e87f72e9225fd185223c24645671afe262f62f0524072300a752cd28e36677bf4c766b50fad62f313b8d9a0f423a474326cd7db91ca2b8bcc15593fcfd21d3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Path \
perl-File-Path"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
