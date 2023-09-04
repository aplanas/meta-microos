SUMMARY = "(DEPRECATED) capture STDOUT and STDERR from Perl code, subprocesses or XS"
DESCRIPTION = "*This module is no longer recommended by the maintainer* - see \
Capture::Tiny instead. \
 \
This module provides routines for capturing STDOUT and STDERR from perl \
subroutines, forked system calls (e.g. 'system()', 'fork()') and from XS or \
C modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1105"

RPM_NAME = "perl-IO-CaptureOutput-1.1105-1.17.noarch.rpm"
RPM_HASH = "f3effa4fc79a80ad1c280b1e6683ba973b6a5991063c86f84ae25df13faeed843c38b8bbdea5b30b3a37d0978409150734567b8c61de82b9e3958003b27a8882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--CaptureOutput \
perl-IO--CaptureOutput---proxy \
perl-IO-CaptureOutput"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
