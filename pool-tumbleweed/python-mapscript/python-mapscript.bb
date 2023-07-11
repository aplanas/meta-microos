SUMMARY = "Python/Mapscript map making extensions to Python"
DESCRIPTION = "The Python/Mapscript extension provides full map customization capabilities \
within the Python programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python-mapscript-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "f3eacab3feefa5d1b66ddeb54321570b79421d302ea7d60d093c045235e3a2282d23b7ce97007418ffe8df31d8a0611e5fbc1049f0b0d303e71af37245a41308"

RPROVIDES:${PN} += "mapserver-python \
python-mapscript \
python3.11dist-mapscript \
python3dist-mapscript"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
libpython3.11.so.1.0 \
python-abi \
python3-base"

inherit rpm
