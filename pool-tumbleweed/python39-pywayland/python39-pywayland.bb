SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python39-pywayland-0.4.15-1.4.aarch64.rpm"
RPM_HASH = "6a8cc40ac360ecea2dcb3397175a4ae3e28364ee9afebb82d1286735bf45611cd3c51862c029299f5d543f2b96ad1ac4be1c15ad7394032403765ae96623a196"

RPROVIDES:${PN} += "python3.9dist-pywayland \
python39-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
