SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python310-ijson-3.1.4-2.2.aarch64.rpm"
RPM_HASH = "643d857c5a5e5aef658cd94e6f5da3cec664c682a97b08f25279d2a47f3984c3d6abd66e392ec81fc90046c4f503760357fddd2f83a484ad16c1821df080c8e9"

RPROVIDES:${PN} += "python3.10dist-ijson \
python310-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
