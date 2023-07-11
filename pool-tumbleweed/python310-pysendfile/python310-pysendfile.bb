SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-pysendfile-2.0.1-3.3.aarch64.rpm"
RPM_HASH = "5649dcd9de3d40c0fc802ef80c0df5a85a41eb766e58a1e2ab72230e5f2a9c24b779389d6f8b386bf945d3bb5e666f926c9222e73ab668df5fa4b61643007e81"

RPROVIDES:${PN} += "python3.10dist-pysendfile \
python310-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
