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

RPM_NAME = "python311-lmdb-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "d0786b3078a39d6e197b4a0af70a3ad5109cb660a9bea6c5f0cb742a4a23bfa28e8e93e432b917a82a9ab62b7fc7b2987c85605a9c6c4d3880c950adffbe6d09"

RPROVIDES:${PN} += "python3.11dist(lmdb) \
python311-lmdb \
python311-lmdb(aarch-64) \
python3dist(lmdb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblmdb-0.9.30.so()(64bit) \
python(abi)"

inherit rpm
