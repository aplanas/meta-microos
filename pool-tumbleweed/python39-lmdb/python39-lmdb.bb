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

RPM_NAME = "python39-lmdb-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "91b1cdc09e9552a219ec862f021462a4a6681df3cb381b2c56886cd415da256ddc4eca5fb90ba5b1649a8c8c1ab9e74eb780319e0e7d812081374401379ce10c"

RPROVIDES:${PN} += "python3.9dist-lmdb \
python39-lmdb \
python3dist-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so \
python-abi"

inherit rpm
