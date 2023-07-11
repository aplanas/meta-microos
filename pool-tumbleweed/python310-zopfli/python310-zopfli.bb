SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-zopfli-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "790d75b34c6fb501285439daf76f0c7b40961305d073a4fe1fd5f1c98609ebba0ae32885cfdc4f47c16a0840517b0719937f40be529d97e6402036ad4d401acb"

RPROVIDES:${PN} += "python3.10dist-zopfli \
python310-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
