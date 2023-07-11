SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-greenlet-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "ade5510f41f56364497cafc1ca755169daa730d384ac44476758d2c7f8431a875173140263f07ae9cb609a2374bdf413b284f406d8965fc228c17911ebd0dc52"

RPROVIDES:${PN} += "python3.9dist-greenlet \
python39-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
