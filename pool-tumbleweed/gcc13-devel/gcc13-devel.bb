SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-devel-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "1d924329cf3575d48defd1a26e96d7a91c3fc359ecafd9d8ac9843dcafadc8646a9db6cc0314838107e05ecf6c3e4cbe1c5daa6fcf5a9ce477ff5a51841b5e36"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mpc-devel"

inherit rpm
