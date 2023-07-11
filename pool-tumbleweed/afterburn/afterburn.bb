SUMMARY = "A cloud provider agent"
DESCRIPTION = "Afterburn is a one-shot agent for cloud-like platforms which interacts with provider-specific metadata endpoints."
LICENSE = "Apache-2.0"

PV = "5.4.1"

RPM_NAME = "afterburn-5.4.1-1.3.aarch64.rpm"
RPM_HASH = "4590fdd0ca730825cc34103ff5749fbe92cdcc5a062eac8972708652dc551bd54f42480e0c43d020c13e93415d28d52851ef141e4a80af7a5cb848f2069a7c42"

RPROVIDES:${PN} += "afterburn"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
