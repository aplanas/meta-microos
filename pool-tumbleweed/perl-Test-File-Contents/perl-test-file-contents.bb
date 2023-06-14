SUMMARY = "Test routines for examining the contents of files"
DESCRIPTION = "Got an app that generates files? Then you need to test those files to make \
sure that their contents are correct. This module makes that easy. Use its \
test functions to make sure that the contents of files are exactly what you \
expect them to be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.242"

RPM_NAME = "perl-Test-File-Contents-0.242-1.2.noarch.rpm"
RPM_HASH = "3cc50769d2191abb0ec5ee04b10d53ff6170f5deb833fa83411dc18ce935e412402f61fb5860f975a4449f18c14e0187a6d205090eb3d674092ce66290d7b7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--File--Contents \
perl-Test-File-Contents"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Test--Builder \
perl-Text--Diff"

inherit rpm
