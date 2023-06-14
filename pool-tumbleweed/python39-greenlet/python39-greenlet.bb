SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-greenlet-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "34e012263e2c1007ef60b1c6c9ce698ac96757ba7c1b9bbf9e0574057374502e971d686374770adac005ea0e44c089ec426dacd35ac1537bd44c4f4dad6c1f5c"

RPROVIDES:${PN} += "python3.9dist-greenlet \
python39-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
