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

RPM_NAME = "perl-File-HomeDir-1.006-1.13.noarch.rpm"
RPM_HASH = "d53fdb6ee9df88fa23ad17a377f88e1df8d48ad0884cc6fcbe90920b5aed76b57acee61c68fc0116523956c86ce895cfdd755be52a4982a1dd672e65a185610e"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Path \
perl-File--Temp \
perl-File--Which"

inherit rpm
