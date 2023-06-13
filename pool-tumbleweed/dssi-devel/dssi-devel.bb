SUMMARY = "Development Package for DSSI plugins"
DESCRIPTION = "This package contains files to be needed for building DSSI plugins."
LICENSE = "GPL-2.0+ & LGPL-2.1+ & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-devel-1.1.1-11.27.aarch64.rpm"
RPM_HASH = "944c6e2afa55fe22d1b77f901f086dc5cce00e6e9e61872bffd6f6b56c543385c0f8f2edbfb8143776102649cf43832b94d8b39ec33f6695aef7799505cbf6a4"

RPROVIDES:${PN} += "dssi-devel \
dssi-devel(aarch-64) \
pkgconfig(dssi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ladspa-devel"

inherit rpm
