SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-profile-2.37-4.4.aarch64.rpm"
RPM_HASH = "ca3d227d78a66dfada380969b9fc24578b3729eea12595a3d1f9835dd3f78841d103c0b505af86cee1bb84d521bb08c041686eaf2016fecb95048f407ba75102"

RPROVIDES:${PN} += "glibc-profile"

RDEPENDS:${PN} += "glibc"

inherit rpm
