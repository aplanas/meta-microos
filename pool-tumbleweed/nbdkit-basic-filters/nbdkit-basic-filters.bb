SUMMARY = "Basic filters for nbdkit"
DESCRIPTION = "This package contains filters for nbdkit which only depend on simple \
C libraries: glibc, gnutls.  Other filters for nbdkit with more \
complex dependencies are packaged separately. \
 \
nbdkit-blocksize-filter     Adjusts block size of requests sent to plugins. \
 \
nbdkit-blocksize-policy-filter  Set block size constraints and policy. \
 \
nbdkit-cache-filter         Server-side cache. \
 \
nbdkit-cacheextents-filter  Caches extents. \
 \
nbdkit-checkwrite-filter    Checks writes match contents of plugin. \
 \
nbdkit-cow-filter           Copy-on-write overlay for read-only plugins. \
 \
nbdkit-ddrescue-filter      Filter for serving from ddrescue dump. \
 \
nbdkit-delay-filter         Injects read and write delays. \
 \
nbdkit-error-filter         Injects errors. \
 \
nbdkit-exitlast-filter      Exits on last client connection. \
 \
nbdkit-exitwhen-filter      Exits gracefully when an event occurs. \
 \
nbdkit-exportname-filter    Adjusts export names between client and plugin. \
 \
nbdkit-extentlist-filter    Places extent list over a plugin. \
 \
nbdkit-fua-filter           Modifies flush behaviour in plugins. \
 \
nbdkit-ip-filter            Filters clients by IP address. \
 \
nbdkit-limit-filter         Limits the number of clients that can connect concurrently. \
 \
nbdkit-log-filter           Logs all transactions to a file. \
 \
nbdkit-luks-filter          Read and write LUKS-encrypted disks. \
 \
nbdkit-multi-conn-filter    Modifies the way multiple clients can connect to the same export simultaneously. \
 \
nbdkit-nocache-filter       Disables cache requests in the underlying plugin. \
 \
nbdkit-noextents-filter     Disables extents in the underlying plugin. \
 \
nbdkit-nofilter-filter      Passthrough filter. \
 \
nbdkit-noparallel-filter    Serializes requests to the underlying plugin. \
 \
nbdkit-nozero-filter        Adjusts handling of zero requests by plugins. \
 \
nbdkit-offset-filter        Serves an offset and range. \
 \
nbdkit-partition-filter     Serves a single partition. \
 \
nbdkit-pause-filter         Pauses NBD requests. \
 \
nbdkit-protect-filter       Write-protect parts of a plugin. \
 \
nbdkit-rate-filter          Limits bandwidth by connection or server. \
 \
nbdkit-readahead-filter     Prefetches data when reading sequentially. \
 \
nbdkit-retry-filter         Reopens connection on error. \
 \
nbdkit-retry-request-filter Retries single requests if they fail. \
 \
nbdkit-scan-filter          Prefetch data ahead of sequential reads. \
 \
nbdkit-stats-filter         Displays statistics about operations. \
 \
nbdkit-swab-filter          Filter for swapping byte order. \
 \
nbdkit-tls-fallback-filter  TLS protection filter. \
 \
nbdkit-truncate-filter      Truncates, expands, rounds up or rounds down size."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-basic-filters-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "5eb5840511ec12e0158160f73078175f3bfb6cec4cf6f222a82631af1b4ec4c2ad2e2afe59dcc0df41b70b4e6061511f440ac8a8c0a7f56fc66be386f9c5aa45"

RPROVIDES:${PN} += "nbdkit-basic-filters \
nbdkit-blocksize-filter \
nbdkit-blocksize-policy-filter \
nbdkit-cache-filter \
nbdkit-cacheextents-filter \
nbdkit-checkwrite-filter \
nbdkit-cow-filter \
nbdkit-ddrescue-filter \
nbdkit-delay-filter \
nbdkit-error-filter \
nbdkit-exitlast-filter \
nbdkit-exitwhen-filter \
nbdkit-exportname-filter \
nbdkit-extentlist-filter \
nbdkit-fua-filter \
nbdkit-ip-filter \
nbdkit-limit-filter \
nbdkit-log-filter \
nbdkit-luks-filter \
nbdkit-nocache-filter \
nbdkit-noextents-filter \
nbdkit-nofilter-filter \
nbdkit-noparallel-filter \
nbdkit-nozero-filter \
nbdkit-offset-filter \
nbdkit-partition-filter \
nbdkit-pause-filter \
nbdkit-protect-filter \
nbdkit-rate-filter \
nbdkit-readahead-filter \
nbdkit-retry-filter \
nbdkit-retry-request-filter \
nbdkit-scan-filter \
nbdkit-stats-filter \
nbdkit-swab-filter \
nbdkit-tls-fallback-filter \
nbdkit-truncate-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libstdc++.so.6 \
nbdkit-server"

inherit rpm
