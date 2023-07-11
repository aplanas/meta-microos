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

RPM_NAME = "python310-lmdb-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "e441b056d691d61067c28bfcf88456d907c0f733900ad69f50a33d66a557c0336c7c1cf6eb8eebc02d974ceeb7fa1afb412d7a88b53aaf227adae493bbb0b5cf"

RPROVIDES:${PN} += "python3.10dist-lmdb \
python310-lmdb \
python3dist-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so \
python-abi"

inherit rpm
