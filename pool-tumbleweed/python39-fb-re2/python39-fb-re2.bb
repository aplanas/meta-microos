SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python39-fb-re2-1.0.7-3.1.aarch64.rpm"
RPM_HASH = "8e2fbc17cee082b4fd8eca548e89804e3fb73ea854a2b096793d89b53c80ab33d34737891d1d717dbc7164bc51f76fc768333138bdeb08dbcb50d048ad99f099"

RPROVIDES:${PN} += "python3.9dist-fb-re2 \
python39-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
