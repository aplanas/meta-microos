SUMMARY = "Universal Python binding for the LMDB 'Lightning' Database"
DESCRIPTION = "This is a universal Python binding for the LMDB 'Lightning' Database. \
 \
LMDB is a tiny database with the following properties: \
  * Ordered map interface (keys are always lexicographically sorted). \
  * Reader/writer transactions: readers don’t block writers, \
    writers don’t block readers. \
    Each environment supports one concurrent write transaction. \
  * Cheap read transactions. \
  * Environments may be opened by multiple processes on the same host. \
  * Multiple named databases may be created with transactions covering \
    all named databases. \
  * Memory mapped, allowing for zero copy lookup and iteration. \
    This is optionally exposed to Python using the buffer() interface. \
  * Maintenance requires no external process or background threads. \
  * No application-level caching is required: \
    LMDB uses the operating system’s buffer cache."
LICENSE = "OLDAP-2.8"

PV = "1.4.1"

RPM_NAME = "python311-lmdb-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "d3dce87b95de743f87385ef41dd20dcdb127d5485e12ae58d129da4c0eee1b5abea946bca5fb73e3cb4d0fdaedcf1fe6918901f0034e38d00a07b4789eea1766"

RPROVIDES:${PN} += "python3-lmdb \
python3.11dist-lmdb \
python311-lmdb \
python3dist-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so \
python-abi"

inherit rpm
