SUMMARY = "A suite of tools for clustering"
DESCRIPTION = "Warewulf v4 combines ultra scalability, flexibility, and simplicity with being \
light weight, non-intrusive, and a great tool for scientists and seasoned \
system administrators alike. Warewulf empowers you to scalably and easily \
manage thousands of compute resources."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-4.4.0-6.4.aarch64.rpm"
RPM_HASH = "cf02dc33b59b9710531a73c1f5525d9a4b9f8a5fd6fa90606c5de4a62eabeee9ebdbb07f2485113a52d085cda9c8f215ac72e08d46dad9987c30b01aa6d078d7"

RPROVIDES:${PN} += "config(warewulf4) \
group(warewulf) \
user(warewulf) \
warewulf4 \
warewulf4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
dhcp-server \
ipxe-bootimgs \
libc.so.6(GLIBC_2.34)(64bit) \
pigz \
sysuser-shadow \
tftp \
warewulf4-overlay"

inherit rpm
