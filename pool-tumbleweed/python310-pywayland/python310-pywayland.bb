SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python310-pywayland-0.4.15-1.5.aarch64.rpm"
RPM_HASH = "6a8e3f3b490d0ba732259a71143c00a58ea5db437932881e2b4fd2e4d3efd2d12cfccb7de9660d3cec528c46ff723e0cd6f464448dcd9b7252031177238415d3"

RPROVIDES:${PN} += "python3.10dist-pywayland \
python310-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
