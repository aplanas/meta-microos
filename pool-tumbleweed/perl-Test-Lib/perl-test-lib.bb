SUMMARY = "Use libraries from a t/lib directory"
DESCRIPTION = "Searches upward from the calling module for a directory _t_ with a _lib_ \
directory inside it, and adds it to the module search path. Looks upward up \
to 5 directories. This is intended to be used in test modules either \
directly in _t_ or in a subdirectory to find their included testing \
libraries located in _t/lib_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-Test-Lib-0.003-1.5.noarch.rpm"
RPM_HASH = "b88c7de27b0114e1c6ed91e83365b669029ad4d8c7d80532085d91838009b57cef1fabf99b8d151abcdf1363b52248238df231feb09d623dda9ba5a88d6d513d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Lib \
perl-Test-Lib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
