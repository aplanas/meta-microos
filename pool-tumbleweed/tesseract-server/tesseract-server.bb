SUMMARY = "Tesseract standalone server"
DESCRIPTION = "This package provides the server files for the Tesseract game."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-server-2018_02_01-3.12.aarch64.rpm"
RPM_HASH = "79164d90a10e59508fb884d6bdc9392a23e0add76cb92fe3f5276547558b6d73a336e0fc1401f8b441e8b9bc56b5b2b2e33475e13cba8e0036a2d8b7460cd3e0"

RPROVIDES:${PN} += "tesseract-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
