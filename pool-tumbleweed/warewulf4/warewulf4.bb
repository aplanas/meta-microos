SUMMARY = "A suite of tools for clustering"
DESCRIPTION = "Warewulf v4 combines ultra scalability, flexibility, and simplicity with being \
light weight, non-intrusive, and a great tool for scientists and seasoned \
system administrators alike. Warewulf empowers you to scalably and easily \
manage thousands of compute resources."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-4.4.0-6.5.aarch64.rpm"
RPM_HASH = "275daf30ac998b03e64608fdad84fd5f4341dacf0eb8b8fcd2cd8c002ac349cfda8e66290b2618ec49b753ec9bc2830c4c4fef385d796e90e58f83f140858b0d"

RPROVIDES:${PN} += "config-warewulf4 \
group-warewulf \
user-warewulf \
warewulf4"

RDEPENDS:${PN} += "/usr/bin/sh \
dhcp-server \
ipxe-bootimgs \
libc.so.6 \
pigz \
sysuser-shadow \
tftp \
warewulf4-overlay"

inherit rpm
