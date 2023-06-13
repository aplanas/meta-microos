SUMMARY = "Log to Files that Archive/Rotate Themselves"
DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.38"

RPM_NAME = "perl-Log-Dispatch-FileRotate-1.38-1.9.noarch.rpm"
RPM_HASH = "c330a19090128f1dca7edf460a58de31ade2bd5ef98170ec4c9c403a59e45103a18cee19baadaddc78a3687fa30d0bfd5203016ec2771e5217b49de6c75f25a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Dispatch::FileRotate) \
perl(Log::Dispatch::FileRotate::Flock) \
perl(Log::Dispatch::FileRotate::Mutex) \
perl-Log-Dispatch-FileRotate"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Date::Manip) \
perl(Log::Dispatch) \
perl(Log::Dispatch::File) \
perl(Log::Dispatch::Output) \
perl(version)"

inherit rpm
