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

RPM_NAME = "python39-lmdb-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "68bd933b4f304576987a80286fbbbbfee36e2c61b9808b5fc6cf4fb08eb3ea5fc16d997b3d3b73c969772f16af3686e0e989227fdfca7f7bddc638e0b0ed23d8"

RPROVIDES:${PN} += "python3.9dist(lmdb) \
python39-lmdb \
python39-lmdb(aarch-64) \
python3dist(lmdb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblmdb-0.9.30.so()(64bit) \
python(abi)"

inherit rpm
