SUMMARY = "NVM Express user space tools"
DESCRIPTION = "NVM Express (NVMe) is a direct attached storage interface. The \
nvme-cli package contains core management tools with minimal \
dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-2.4-2.1.aarch64.rpm"
RPM_HASH = "35528204fb65c90f463b5a80bcbf5c10aee52ba2e2fbe88dd4d56cd62db7fdca9a5975a83762d7d03789494212901b9b677de9d3382fe05fae5a08c1a3de26b9"

RPROVIDES:${PN} += "nvme-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhugetlbfs.so \
libjson-c.so.5 \
libnvme-mi.so.1 \
libnvme.so.1"

inherit rpm
