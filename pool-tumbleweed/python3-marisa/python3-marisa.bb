SUMMARY = "Python3 bindings for marisa"
DESCRIPTION = "Python3 bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "python3-marisa-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "8aa15fd738942e3c65505fc51462ad5b09ab26e742b922159e795ad439b209dec896b5f3b7025c0d0d64b7c6c83b545cb2d957a141c28bf7ad8cb98019d036d7"

RPROVIDES:${PN} += "python3-marisa \
python3.11dist-marisa \
python3dist-marisa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6 \
marisa \
python-abi"

inherit rpm
