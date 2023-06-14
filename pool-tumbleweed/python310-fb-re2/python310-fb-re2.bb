SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python310-fb-re2-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "8fc43c262f44211be0ab17235f9e1691bfcee910f5496b5d8daf510e3455dc6f38d1ab1cbd4440d122499b6fc98b024a12acea1d97453a735e26f917db7b8f6b"

RPROVIDES:${PN} += "python3-fb-re2 \
python3.10dist-fb-re2 \
python310-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.10 \
libstdc++.so.6 \
python-abi"

inherit rpm
