SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python39-fastbencode-0.2-1.7.aarch64.rpm"
RPM_HASH = "84aeae0b524704669e59c3fbec6180c881a43e7562a5ae1efa06dc4b624fcd677d14c166c1d54a708df4417f42270435038cef146c8f88435450a1cc44da8522"

RPROVIDES:${PN} += "python3.9dist-fastbencode \
python39-fastbencode \
python3dist-fastbencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
