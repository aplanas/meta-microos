SUMMARY = "NVM Express user space tools"
DESCRIPTION = "NVM Express (NVMe) is a direct attached storage interface. The \
nvme-cli package contains core management tools with minimal \
dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-2.4-1.2.aarch64.rpm"
RPM_HASH = "e167f0f950214e340628555f8a3333e1085a55db1c71d3e6ca1fcf57b8a019cf81abb6ac5305fa77a9c1bb64feacb75cf565166ad0456f7f7a3a3df74e542620"

RPROVIDES:${PN} += "nvme-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhugetlbfs.so \
libjson-c.so.5 \
libnvme-mi.so.1 \
libnvme.so.1"

inherit rpm
