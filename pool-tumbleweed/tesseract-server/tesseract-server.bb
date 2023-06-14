SUMMARY = "Tesseract standalone server"
DESCRIPTION = "This package provides the server files for the Tesseract game."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-server-2018_02_01-3.11.aarch64.rpm"
RPM_HASH = "99314b57003984ce17f7e33b9bf1776b706a004dbbaaa1b41550d25267cefc2ac97d9151cc56ef539c2c0e1f3920748debed4d5b46cc03b0aca6bf64521f7e05"

RPROVIDES:${PN} += "tesseract-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
