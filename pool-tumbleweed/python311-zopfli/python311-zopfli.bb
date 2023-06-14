SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python311-zopfli-0.2.2-2.1.aarch64.rpm"
RPM_HASH = "9af7896042bb8c986d72b44df2321991721111e6ac25c6d22cf9e4cd74eb20334aee77d1498a79f4063729f021c63106659dbb6e70ba2b4beba4bf3c6857c7bb"

RPROVIDES:${PN} += "python3.11dist-zopfli \
python311-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
