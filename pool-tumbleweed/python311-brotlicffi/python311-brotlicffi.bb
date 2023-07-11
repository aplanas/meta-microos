SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python311-brotlicffi-1.0.9.2-2.1.aarch64.rpm"
RPM_HASH = "60d5c74a8a1ac4db906b00964e7ab45b638e233f6851f0f54d2e7eeb207def6b434650fbfae49ad9b06c61d7822afef0a1123789a6b0d7a5df525d2e03b76812"

RPROVIDES:${PN} += "python3-brotlicffi \
python3.11dist-brotlicffi \
python311-brotlicffi \
python3dist-brotlicffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
