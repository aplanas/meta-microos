SUMMARY = "Test routines for examining the contents of files"
DESCRIPTION = "Got an app that generates files? Then you need to test those files to make \
sure that their contents are correct. This module makes that easy. Use its \
test functions to make sure that the contents of files are exactly what you \
expect them to be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.242"

RPM_NAME = "perl-Test-File-Contents-0.242-1.3.noarch.rpm"
RPM_HASH = "8afd0f21d954ad3209a1459044ca00e87b7c7654f1b29726941529aa8f3b4b86c7cc131546a3a83169cf3231a95a4b255736ee419ea7495f0536f186e79e37e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--File--Contents \
perl-Test-File-Contents"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Builder \
perl-Text--Diff"

inherit rpm
