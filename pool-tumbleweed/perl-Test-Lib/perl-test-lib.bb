SUMMARY = "Use libraries from a t/lib directory"
DESCRIPTION = "Searches upward from the calling module for a directory _t_ with a _lib_ \
directory inside it, and adds it to the module search path. Looks upward up \
to 5 directories. This is intended to be used in test modules either \
directly in _t_ or in a subdirectory to find their included testing \
libraries located in _t/lib_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-Test-Lib-0.003-1.6.noarch.rpm"
RPM_HASH = "29404eaa3267e393eff8e41f8ee886f7d133334e2ef803bfc09eaeb8df10a325c46e5754432b1c0057ce1f3ebc35710adefaa1be32a209284459b7555d6b127f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Lib \
perl-Test-Lib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
