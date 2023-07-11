SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-greenlet-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "06ac8e1d5199175412389cf5b6f95a44d9a398a084c22cc08fff8df0c464ce1b693e84c039908db7ea85f3c5814ffb7e007be6c6938bb1adfcc916dddfa10275"

RPROVIDES:${PN} += "python3-greenlet \
python3.11dist-greenlet \
python311-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
