SUMMARY = "Best-Effort Extent-Same, a btrfs deduplication agent"
DESCRIPTION = "bees is a block-oriented userspace deduplication agent designed for large btrfs \
filesystems. It is an offline dedupe combined with an incremental data scan \
capability to minimize time data spends on disk from write to dedupe. \
 \
Hilights: \
 \
* Space-efficient hash table and matching algorithms - can use as little as 1 \
  GB hash table per 10 TB unique data (0.1GB/TB) \
* Daemon incrementally dedupes new data using btrfs tree search \
* Works with btrfs compression - dedupe any combination of compressed and uncompressed files \
* Persistent hash table for rapid restart after shutdown \
* Whole-filesystem dedupe - including snapshots \
* Constant hash table size - no increased RAM usage if data set becomes larger \
* Works on live data - no scheduled downtime required \
* Automatic self-throttling based on system load"
LICENSE = "GPL-3.0-only"

PV = "0.9.3"

RPM_NAME = "bees-0.9.3-1.2.aarch64.rpm"
RPM_HASH = "adb0163f96db5f0ed727da4292256da2fba14996dd99a033e663b94a3e5837627ead0a8509b6247098796f1fb93c8ac87cdae12754dc2b5838cda2407bba911e"

RPROVIDES:${PN} += "bees"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
