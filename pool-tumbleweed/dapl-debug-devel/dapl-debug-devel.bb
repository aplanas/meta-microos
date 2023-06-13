SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-devel-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "348faf1747da3556a56709827c0e895a0aba70a35ed19797e9bb5adfaf66f468fbefd94f041d56643503a5e06d045a97a6265f1ea309043cc311eb371a99aa45"

RPROVIDES:${PN} += "dapl-debug-devel \
dapl-debug-devel(aarch-64)"

RDEPENDS:${PN} += "dapl-debug \
glibc-devel"

inherit rpm
