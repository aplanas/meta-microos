SUMMARY = "Find your home and other directories on any platform"
DESCRIPTION = "*File::HomeDir* is a module for locating the directories that are 'owned' \
by a user (typically your user) and to solve the various issues that arise \
trying to find them consistently across a wide variety of platforms. \
 \
The end result is a single API that can find your resources on any \
platform, making it relatively trivial to create Perl software that works \
elegantly and correctly no matter where you run it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006"

RPM_NAME = "perl-File-HomeDir-1.006-1.12.noarch.rpm"
RPM_HASH = "6dc53dcbbbe988bd5aede4c2da660bc8bf9618571a99b690b0ae1a1d039ef0540a8a7b50a903dbf6b177e74d9948346d966364c95f4a0ab47cef6b98afd84312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--HomeDir \
perl-File--HomeDir--Darwin \
perl-File--HomeDir--Darwin--Carbon \
perl-File--HomeDir--Darwin--Cocoa \
perl-File--HomeDir--Driver \
perl-File--HomeDir--FreeDesktop \
perl-File--HomeDir--MacOS9 \
perl-File--HomeDir--Test \
perl-File--HomeDir--Unix \
perl-File--HomeDir--Windows \
perl-File-HomeDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Path \
perl-File--Temp \
perl-File--Which"

inherit rpm
