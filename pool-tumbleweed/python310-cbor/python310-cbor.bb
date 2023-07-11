SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-cbor-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "47b6274af4824fbdf8c0257f5db7bc19fc357d8f49d81368e4f17632000654e000261f6066a31097e897d3efb5b0846e073a8338c63b54faea9b66c086007058"

RPROVIDES:${PN} += "python3.10dist-cbor \
python310-cbor \
python3dist-cbor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-base"

inherit rpm
