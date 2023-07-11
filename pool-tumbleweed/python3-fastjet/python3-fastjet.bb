SUMMARY = "Python3 bindings for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. \
 \
This package provides python3 bindings for fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "python3-fastjet-3.4.0-2.9.aarch64.rpm"
RPM_HASH = "77bbc8397d29ab182de5cb229b733c3c226df6d7e48ddb44d8bd9608bf5d26ea420befc19e54114156f2d31292d0ee666e918abbe7acc01d2b396bf421514cd8"

RPROVIDES:${PN} += "python3-fastjet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjet.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
