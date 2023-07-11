SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python311-hiredis-2.2.2-3.3.aarch64.rpm"
RPM_HASH = "e938840628af601a868521f0c685daa4da836738f7d6268a2758eb5c5b6f802ef73526c1953a6f924c7e93b5f917edc530567d2addbe0ea2516bc7ad6427e1ee"

RPROVIDES:${PN} += "python3-hiredis \
python3.11dist-hiredis \
python311-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
python-abi"

inherit rpm
