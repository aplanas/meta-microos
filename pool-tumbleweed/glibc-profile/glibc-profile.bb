SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.38"

RPM_NAME = "glibc-profile-2.38-1.1.aarch64.rpm"
RPM_HASH = "28fc42abe2dcf373d36f6f45c422964692b81634da1992b9b393be02e40c820a56fe8c160c3e0c1028603323b5203a4d2214cd044c1120b7165d786e8ab959a1"

RPROVIDES:${PN} += "glibc-profile"

RDEPENDS:${PN} += "glibc"

inherit rpm
