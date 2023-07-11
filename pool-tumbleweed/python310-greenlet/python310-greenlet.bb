SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-greenlet-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "679098c4443ae8832ec8dc8ab7a06c46296b6bf097e9b74e4977141f83339ce614feef8f7f852c7cc2e500fa0f484f104ec9bff9eaaeed911a7ef19b8c778b5f"

RPROVIDES:${PN} += "python3.10dist-greenlet \
python310-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
