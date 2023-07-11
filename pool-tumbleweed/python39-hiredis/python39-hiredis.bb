SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python39-hiredis-2.2.2-3.3.aarch64.rpm"
RPM_HASH = "accf4aca04258074202a32ab2e77a893c4e7c3d06701a2b7bc3cc0dc5e1f3c8e1f20a6613c985d81ef87854d2272d52b4ba36960e4cac9ac55a095250623244d"

RPROVIDES:${PN} += "python3.9dist-hiredis \
python39-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
python-abi"

inherit rpm
