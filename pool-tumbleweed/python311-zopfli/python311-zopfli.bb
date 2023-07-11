SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python311-zopfli-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "e9ee6aeab2340a0ac246ba8837d7a4e3be6e7846a891dae04afaf010946b97a80750c7f70f278294a5be219010da7bccfcd1de522e381bf2770bad037101e8c7"

RPROVIDES:${PN} += "python3-zopfli \
python3.11dist-zopfli \
python311-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
