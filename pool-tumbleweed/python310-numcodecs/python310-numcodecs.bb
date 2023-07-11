SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-numcodecs-0.11.0-1.6.aarch64.rpm"
RPM_HASH = "ed7a7bbc13deb55cd073884f619d610b2cb73b2b3ad675ee3329820eb42079073fd5a03205854dfa4105be81495dbc00b3c895d57b1d5036868480b27260cf0b"

RPROVIDES:${PN} += "python3.10dist-numcodecs \
python310-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python310-entrypoints \
python310-numpy"

inherit rpm
