SUMMARY = "NVM Express user space tools"
DESCRIPTION = "NVM Express (NVMe) is a direct attached storage interface. The \
nvme-cli package contains core management tools with minimal \
dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-2.4-1.1.aarch64.rpm"
RPM_HASH = "e37e2329648dffa1ab140febf874153af5bb93c864b8d50919e86b5732b0ed10e40c479377e09e1fc5f07205a90d16816f2081ca082b05fc5f7b471f876d61ec"

RPROVIDES:${PN} += "nvme-cli"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhugetlbfs.so \
libjson-c.so.5 \
libnvme-mi.so.1 \
libnvme.so.1"

inherit rpm
