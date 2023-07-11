SUMMARY = "Find the path to your perl"
DESCRIPTION = "This module tries to find the path to the currently running perl. It \
(optionally) exports the following functions:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Devel-FindPerl-0.016-1.5.noarch.rpm"
RPM_HASH = "570b95a7972f9a95a2a049094b344d06e61e21308a8c90ed25231b17380831dbe2d30d75acf72be9ef0dc384046b864f6465ef96ad96305a36e93514e4911cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--FindPerl \
perl-Devel-FindPerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
