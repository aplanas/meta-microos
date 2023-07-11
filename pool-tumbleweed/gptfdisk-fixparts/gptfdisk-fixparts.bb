SUMMARY = "A tool for repairing certain types of damage to MBR disks"
DESCRIPTION = "A program that corrects errors that can creep into MBR-partitioned \
disks. Removes stray GPT data, fixes mis-sized extended partitions, \
and enables changing primary vs. logical partition status. Also \
provides a few additional partition manipulation features."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-fixparts-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "9c04ad267143ed2e0b7730b7c00ea06f8b2d6399847d311565024dd2d458af5b81a357ed70f63702c5c15d8381797b8391fad62e2e194b8015655965929b6b27"

RPROVIDES:${PN} += "gptfdisk-fixparts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
