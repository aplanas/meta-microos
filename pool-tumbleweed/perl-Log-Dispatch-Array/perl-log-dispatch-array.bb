SUMMARY = "Log events to an array (reference)"
DESCRIPTION = "This provides a Log::Dispatch log output system that appends logged events \
to an array reference. This is probably only useful for testing the logging \
of your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.005"

RPM_NAME = "perl-Log-Dispatch-Array-1.005-1.3.noarch.rpm"
RPM_HASH = "8c07b2aa6ac7cee26dfbc0849fb0bb15d864925425d39c3456b45bc1df2fc55f2b802bd51ffd31279be91b70ab965e78b3421852ea8a36e8d0cc745aa665483f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Array \
perl-Log-Dispatch-Array"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Log--Dispatch--Output \
perl-parent"

inherit rpm
