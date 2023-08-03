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

PV = "0.10"

RPM_NAME = "bees-0.10-1.1.aarch64.rpm"
RPM_HASH = "2a5dcb0c6b133525058bbd1ee4799dadda22ea133af38ee2f3457134c5440aa38a1629f377e60fcbccc7916ee3912a2f208b7f7d7d64c57851a4bb9b1eff7cd0"

RPROVIDES:${PN} += "bees"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
