SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python311-hiredis-2.2.2-2.3.aarch64.rpm"
RPM_HASH = "30dc645aa30b6b94c031460d967b1821eaf96b4e4fdd12eaa47e4ea02a206dd740291fcd906f28c2b6002726d270c4b3499c1b9e2aad261bf4339b9a947a3805"

RPROVIDES:${PN} += "python3.11dist-hiredis \
python311-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
python-abi"

inherit rpm
