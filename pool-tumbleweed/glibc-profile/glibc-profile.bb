SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.38"

RPM_NAME = "glibc-profile-2.38-2.1.aarch64.rpm"
RPM_HASH = "30679566f74beb4f89d9bc56fdac1e5196a2f98263e0f57cc08ec9b02ddf9a1582ba8fce67f40654fe657fcdcfcaada9800832b08db0cd3ff831a4175be21382"

RPROVIDES:${PN} += "glibc-profile"

RDEPENDS:${PN} += "glibc"

inherit rpm
