SUMMARY = "Log events to an array (reference)"
DESCRIPTION = "This provides a Log::Dispatch log output system that appends logged events \
to an array reference. This is probably only useful for testing the logging \
of your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.005"

RPM_NAME = "perl-Log-Dispatch-Array-1.005-1.4.noarch.rpm"
RPM_HASH = "f6e6af378b30923d33e44ec1b85ce6105e198f95fba41700b1c49b066a4d8d62f0a6299f32075a0e5e8b4c9eab9212b9c38844ae8a6d656f2da8a230c5e141b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Array \
perl-Log-Dispatch-Array"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Log--Dispatch--Output \
perl-parent"

inherit rpm
