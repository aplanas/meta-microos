SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-profile-2.37-5.1.aarch64.rpm"
RPM_HASH = "a0139a9e0398d6fc76198ea8c4bc8511a3b1d749bb4b5fe51ef8793c3c7b7391e935631018981452f860c7d24ef6713ba162b03bd79c723f81a287430704f44f"

RPROVIDES:${PN} += "glibc-profile"

RDEPENDS:${PN} += "glibc"

inherit rpm
