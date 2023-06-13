SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-greenlet-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "48b72a45a250c77f7c9284068018b76c1894ccdde1b43f930e18aed5cbf5232b328c0c51122f0c57e725b0cfad327060aad5f5bdf7085b701f0b513ff6f59dff"

RPROVIDES:${PN} += "python3-greenlet \
python3.10dist(greenlet) \
python310-greenlet \
python310-greenlet(aarch-64) \
python3dist(greenlet)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
