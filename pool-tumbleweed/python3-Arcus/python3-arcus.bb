SUMMARY = "Python bindings for libArcus"
DESCRIPTION = "Python bindings for the Arcus communication library."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "python3-Arcus-4.13.1-4.2.aarch64.rpm"
RPM_HASH = "d6ad751f0b31bcf98b17a12872ccb55aa1f4055eb1343c6b46c322896f124b7f5a942b8abeb8682935397d5e958165aaa1859d59cefc52bd6f1536126870b434"

RPROVIDES:${PN} += "python3-Arcus \
python3.11dist-arcus \
python3dist-arcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus-Ultimaker \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
