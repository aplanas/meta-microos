SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python311-Fiona-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "b48acb045267a7db307cd685dd19e16c402b81341ced928955e0af7058494cc462636ca085442bcbc31d5f463574d7306b87626bfa992aac665504c38a1428b6"

RPROVIDES:${PN} += "python3.11dist-fiona \
python311-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python-abi \
python311-attrs \
python311-click \
python311-click-plugins \
python311-cligj \
python311-munch \
python311-six"

inherit rpm
