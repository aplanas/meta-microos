SUMMARY = "Core partio libraries"
DESCRIPTION = "The python3-partio contains Python 3 binding for the library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "python3-partio-1.14.6-1.10.aarch64.rpm"
RPM_HASH = "19e06f0b8b46cdf1315f80a75e5ae1ab1debcb584e7ce710e5fad1e058cb82ee7d5a3bcac2d44179f8a1f593276cf3952159089291b410540a23d52e26151ae4"

RPROVIDES:${PN} += "python3-partio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpartio.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
partio \
python-abi"

inherit rpm
