SUMMARY = "Converts JPEG images to ASCII"
DESCRIPTION = "jp2a is a JPEG to ASCII converter."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "jp2a-1.1.1-2.7.aarch64.rpm"
RPM_HASH = "f1431b6ad07f4284856e5a7ad4a3e33942186531218cc1abd74f906b3dc390f9b6ab31fb0106876d3238682b561014a97e074c693031bed30c7117c0ace8d13b"

RPROVIDES:${PN} += "jp2a"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
