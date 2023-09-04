SUMMARY = "Test routines for examining the contents of files"
DESCRIPTION = "Got an app that generates files? Then you need to test those files to make \
sure that their contents are correct. This module makes that easy. Use its \
test functions to make sure that the contents of files are exactly what you \
expect them to be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.242"

RPM_NAME = "perl-Test-File-Contents-0.242-1.4.noarch.rpm"
RPM_HASH = "8129d0e715d4b0aa008cd638f619524efff201b2039c3d02b20e6233f0b5f22119aed67f651c01df92e7ea68cf1d764e0815214a4c5329c540637e588627de52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--File--Contents \
perl-Test-File-Contents"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Builder \
perl-Text--Diff"

inherit rpm
