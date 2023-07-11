SUMMARY = "PMI-X plugins version 1"
DESCRIPTION = "This package contains plugins used by libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-plugins-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "bdad432cfcd7c849adbff410e739fd2a6eac05a8b3339986452cde1481d4dea9f35d15da04f56504851e62f72bc6a9dff203468d26384f3b334480b48ad80066"

RPROVIDES:${PN} += "pmix-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libmca-common-dstore.so.1 \
libmca-common-dstore1 \
libpmix.so.2 \
libz.so.1"

inherit rpm
