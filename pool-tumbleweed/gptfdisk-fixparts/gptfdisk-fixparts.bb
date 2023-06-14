SUMMARY = "A tool for repairing certain types of damage to MBR disks"
DESCRIPTION = "A program that corrects errors that can creep into MBR-partitioned \
disks. Removes stray GPT data, fixes mis-sized extended partitions, \
and enables changing primary vs. logical partition status. Also \
provides a few additional partition manipulation features."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-fixparts-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "739cf227ea0ef8dbe4ab6ce3ffbc8cd661fc882b5e6e225754fe5100aff9ab08c4ebc05e93fbf9d2ee52d390134db1dfac745ed91618cf9e8d3d35f98639d0d7"

RPROVIDES:${PN} += "gptfdisk-fixparts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
