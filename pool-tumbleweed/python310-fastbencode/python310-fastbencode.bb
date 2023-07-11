SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python310-fastbencode-0.2-1.7.aarch64.rpm"
RPM_HASH = "7a0a499b11c10ba0e7b498f493cb2a7bc2bb4c6f4d7a51ecee363d99e53e9ffd7c046f67f9dacade7547168b4860b7b18c6291b549e8e7c79183ba25a9d530fd"

RPROVIDES:${PN} += "python3.10dist-fastbencode \
python310-fastbencode \
python3dist-fastbencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
