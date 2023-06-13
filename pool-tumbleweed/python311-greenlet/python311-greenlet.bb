SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-greenlet-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "c2c8a79ab5b93e761742f28ca4b5354972097d73b1fb65dfcc3ede2cc5cf6739c02113425d619d5ec953c20ddaab88520131d74ba93bbf8999e656967f5baaa4"

RPROVIDES:${PN} += "python3.11dist(greenlet) \
python311-greenlet \
python311-greenlet(aarch-64) \
python3dist(greenlet)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
