SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python311-immutables-0.19-3.1.aarch64.rpm"
RPM_HASH = "f7c2e4e5ad955f9be1e3c9daf5891d22641b17a84a1f861457d0ade907d787fec9da4c9128d9af781583befff109f2ac683b28b4c33c52ee74203ee7b07464ff"

RPROVIDES:${PN} += "python3-immutables \
python3.11dist-immutables \
python311-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
