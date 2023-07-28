SUMMARY = "Debug/Test tool to exercise the btrfs out-of-band deduplication ioctl"
DESCRIPTION = "Debug/Test tool to exercise a btrfs ioctl for deduplicating file regions."
LICENSE = "GPL-2.0-only"

PV = "0.12"

RPM_NAME = "btrfs-extent-same-0.12-1.1.aarch64.rpm"
RPM_HASH = "5185e9f850bd86fa141606a0dd187968b311b1a1af116fd36903618a8cf95b694f74c7b3edf44704d560791cbcc5a9a6899640d5c1dfe6bb782378170f584c02"

RPROVIDES:${PN} += "btrfs-extent-same"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
