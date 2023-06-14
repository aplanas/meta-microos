SUMMARY = "(DEPRECATED) capture STDOUT and STDERR from Perl code, subprocesses or XS"
DESCRIPTION = "*This module is no longer recommended by the maintainer* - see \
Capture::Tiny instead. \
 \
This module provides routines for capturing STDOUT and STDERR from perl \
subroutines, forked system calls (e.g. 'system()', 'fork()') and from XS or \
C modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1105"

RPM_NAME = "perl-IO-CaptureOutput-1.1105-1.15.noarch.rpm"
RPM_HASH = "4124561e8003cbd82326024b30b783bd2b5326e618e5613da0a152217301c0fbcc8521a094845714f6ae366419ed964b1ed91c2749f1cbaa426945aa733a7984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--CaptureOutput \
perl-IO--CaptureOutput---proxy \
perl-IO-CaptureOutput"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
