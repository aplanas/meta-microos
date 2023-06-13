SUMMARY = "Python/Mapscript map making extensions to Python"
DESCRIPTION = "The Python/Mapscript extension provides full map customization capabilities \
within the Python programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python-mapscript-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "7508a69cf05bfa575bcf7a27b19d5928e66ad28a0770619693c8b19e0c9725edba08b37d49fa3e8fec79983fa6eee86c4136ef7b63f3b32af01d02cc459ca39e"

RPROVIDES:${PN} += "mapserver-python \
python-mapscript \
python-mapscript(aarch-64) \
python3.10dist(mapscript) \
python3dist(mapscript)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmapserver.so.2()(64bit) \
libmapserver2 \
libpython3.10.so.1.0()(64bit) \
python(abi) \
python3-base"

inherit rpm
