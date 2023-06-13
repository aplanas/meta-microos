SUMMARY = "Performance Co-Pilot (PCP) development tools and documentation"
DESCRIPTION = "Performance Co-Pilot (PCP) documentation and tools for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-devel-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "05ce8a23e4e40288e9bbc71d90e227702cf5d78c65242c9045808ebf298dd4e4e1cbb3b316221e7c3c14323a46150c2726f3295634c97167cdf561523d41139b"

RPROVIDES:${PN} += "config(pcp-devel) \
pcp-devel \
pcp-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
