SUMMARY = "Easy-to-use IPMI server management utilities"
DESCRIPTION = "The ipmiutil package provides easy-to-use utilities to view the SEL, \
perform an IPMI chassis reset, set up the IPMI LAN and Platform Event Filter \
entries to allow SNMP alerts, Serial-Over-LAN console, event daemon, and \
other IPMI tasks. \
These can be invoked with the metacommand ipmiutil, or via subcommand \
shortcuts as well.  IPMIUTIL can also write sensor thresholds, FRU asset tags, \
and has a full IPMI configuration save/restore. \
An IPMI driver can be provided by either the OpenIPMI driver (/dev/ipmi0) \
or the Intel IPMI driver (/dev/imb), etc.  If used locally and no driver is \
detected, ipmiutil will use user-space direct I/Os instead."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-3.1.8-1.5.aarch64.rpm"
RPM_HASH = "519e317cd0b89383d22e51d98a1b6aa7eae5f709dd02e3d53a3b712a4da122779d511c70fe2b255f39b121b5681b7f79fa27666ccbc7b0c4b8aeed37d8f40733"

RPROVIDES:${PN} += "ipmiutil"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
