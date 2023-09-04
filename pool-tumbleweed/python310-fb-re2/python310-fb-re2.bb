SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python310-fb-re2-1.0.7-3.1.aarch64.rpm"
RPM_HASH = "045949082a51c661d114172ecb46f057ed3e1c3726e0fd0fa3362eee14c36718274c461170f299718167c9b49d76c4940995b88623feeca94dda543383d89936"

RPROVIDES:${PN} += "python3.10dist-fb-re2 \
python310-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
