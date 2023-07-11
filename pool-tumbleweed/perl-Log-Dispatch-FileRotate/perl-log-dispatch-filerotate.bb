SUMMARY = "Log to Files that Archive/Rotate Themselves"
DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.38"

RPM_NAME = "perl-Log-Dispatch-FileRotate-1.38-1.10.noarch.rpm"
RPM_HASH = "c68eb16549e2c451b1c5910e4ee122921de0366661192bfdf11d08154128cff0998a5a73ed0350742f8dd2b4eb783b9ca8287e31bc0d88abb0ba71388ca7308a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--FileRotate \
perl-Log--Dispatch--FileRotate--Flock \
perl-Log--Dispatch--FileRotate--Mutex \
perl-Log-Dispatch-FileRotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Manip \
perl-Log--Dispatch \
perl-Log--Dispatch--File \
perl-Log--Dispatch--Output \
perl-version"

inherit rpm
