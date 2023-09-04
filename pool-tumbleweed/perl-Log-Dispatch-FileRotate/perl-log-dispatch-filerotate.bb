SUMMARY = "Log to Files that Archive/Rotate Themselves"
DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.38"

RPM_NAME = "perl-Log-Dispatch-FileRotate-1.38-1.11.noarch.rpm"
RPM_HASH = "e4be1dea328069304cd5901ee43cab7844bce007753a97ed47152efc9bacd512606202bbd4e3265d2fc36090cdffd0e2a27b366d05c3c111f628ed38d4738936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--FileRotate \
perl-Log--Dispatch--FileRotate--Flock \
perl-Log--Dispatch--FileRotate--Mutex \
perl-Log-Dispatch-FileRotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Manip \
perl-Log--Dispatch \
perl-Log--Dispatch--File \
perl-Log--Dispatch--Output \
perl-version"

inherit rpm
