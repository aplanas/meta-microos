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

RPM_NAME = "perl-File-HomeDir-1.006-1.14.noarch.rpm"
RPM_HASH = "8eb0eec16c9b0881a500f1d47483eacbe403bf0ea751ab6f573d1b2d5598905401054a5d67a5d753783033d5354b6fab2927ea097fed89d56011f0bb79990308"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Path \
perl-File--Temp \
perl-File--Which"

inherit rpm
