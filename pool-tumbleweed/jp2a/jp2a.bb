SUMMARY = "Converts JPEG images to ASCII"
DESCRIPTION = "jp2a is a JPEG to ASCII converter."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "jp2a-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "ee498b9cba9612a734a549a66642acc255a61f823d4de1c85226463da08c88ab9513e1cc18e79700549a82c32bf1bb3e3352679e9bab9158627a44fe7c2b011f"

RPROVIDES:${PN} += "jp2a"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
