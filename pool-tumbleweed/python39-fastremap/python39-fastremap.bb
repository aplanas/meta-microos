SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.5"

RPM_NAME = "python39-fastremap-1.13.5-1.3.aarch64.rpm"
RPM_HASH = "008b836f7ea8b35947a06fa4738ea79c5dd458b212dfd9bc72b98dd31fb95a4e6a26cc642cad2f97172e5f1d58bd3482502330425d455335c6b7c322833e486c"

RPROVIDES:${PN} += "python3.9dist-fastremap \
python39-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
