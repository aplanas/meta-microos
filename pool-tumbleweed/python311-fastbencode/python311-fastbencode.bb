SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python311-fastbencode-0.2-1.5.aarch64.rpm"
RPM_HASH = "829cadb8f18793d59da20cbf0e850df733c0f2dce6b73051271496be3e6cb736499c2f9336aa5e668f4c4eed70920d6e59ed66558fc188a58feac3a3d7b43a38"

RPROVIDES:${PN} += "python3.11dist(fastbencode) \
python311-fastbencode \
python311-fastbencode(aarch-64) \
python3dist(fastbencode)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
