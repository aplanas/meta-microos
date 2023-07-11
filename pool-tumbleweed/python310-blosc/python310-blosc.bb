SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python310-blosc-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "e547c77fea784dab6b344c19515df833cbf2dc4054368da377091206a89a1b847a97243c4195e5ae6db00ead609ced0133ad09199e0d6afb4eaa1537ec7150cd"

RPROVIDES:${PN} += "python3.10dist-blosc \
python310-blosc \
python3dist-blosc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
python-abi"

inherit rpm
