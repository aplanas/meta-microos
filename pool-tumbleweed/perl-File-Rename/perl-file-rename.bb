SUMMARY = "Perl extension for renaming multiple files"
DESCRIPTION = "Perl extension for renaming multiple files"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.10.0"

RPM_NAME = "perl-File-Rename-2.10.0-1.1.noarch.rpm"
RPM_HASH = "bf77a9c664f4033e1d4032e079723c410b695d310bb7abdfa787f18c2538e54ab04c7b2df8283c567251bb79f17874fc3b99b7e94f5d28ce2967c87dcf7a5036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rename \
perl-File--Rename--Options \
perl-File--Rename--Unicode \
perl-File-Rename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
