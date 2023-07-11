SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python39-zopfli-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "54acad4b1e5c0f3b94bb6c016cb1209d57dceb4014650c1eef7fa2cf135c049bf33c4a140b19298156ad19f86c0e4b1cb8656c9a71c8970acc431086759ab31b"

RPROVIDES:${PN} += "python3.9dist-zopfli \
python39-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
