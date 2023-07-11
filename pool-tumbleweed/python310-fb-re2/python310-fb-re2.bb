SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python310-fb-re2-1.0.7-2.15.aarch64.rpm"
RPM_HASH = "7feecba8be6f378c404f3774693a2ca7a43ef2b97c318d8d2f4c329baeb9ecede8179bf2b0aa1ca06c3d54b97997c082ef7fa12b4216ce5f90d85e9a14dcd31f"

RPROVIDES:${PN} += "python3.10dist-fb-re2 \
python310-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.10 \
libstdc++.so.6 \
python-abi"

inherit rpm
