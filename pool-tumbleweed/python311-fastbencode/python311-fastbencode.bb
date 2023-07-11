SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python311-fastbencode-0.2-1.7.aarch64.rpm"
RPM_HASH = "1373bcd02caa6ce994f6322b8ee1c27550d42af55071c2b263c8526d0aafb3f01474c8ad4a6f61d059f663a6e86703b39b829985a35dd71d0bf3b33c2b02b13c"

RPROVIDES:${PN} += "python3-fastbencode \
python3.11dist-fastbencode \
python311-fastbencode \
python3dist-fastbencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
