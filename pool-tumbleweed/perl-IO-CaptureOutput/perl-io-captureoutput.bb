SUMMARY = "(DEPRECATED) capture STDOUT and STDERR from Perl code, subprocesses or XS"
DESCRIPTION = "*This module is no longer recommended by the maintainer* - see \
Capture::Tiny instead. \
 \
This module provides routines for capturing STDOUT and STDERR from perl \
subroutines, forked system calls (e.g. 'system()', 'fork()') and from XS or \
C modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1105"

RPM_NAME = "perl-IO-CaptureOutput-1.1105-1.16.noarch.rpm"
RPM_HASH = "654de4b14d830d2f83e8692816e35e8eac930cd024ce035dba6c266f6cf9bc80d5c6685acc7a4d6de8e57c8c5ecebdc61bc68d3bf4874c80da108b73ae6f82aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--CaptureOutput \
perl-IO--CaptureOutput---proxy \
perl-IO-CaptureOutput"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
