SUMMARY = "An embeddable Javascript interpreter"
DESCRIPTION = "MuJS is a lightweight Javascript interpreter designed for embedding in other software to extend them with scripting capabilities."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "mujs-1.3.3-1.2.aarch64.rpm"
RPM_HASH = "c13bda1bd835360fb09a7f6d53a7c8aa484924e5b9c6866619e9b80518d2d11649823cdb263a09ec0e954a2e7d357be7b00eb0989531aaa05c97a9f95f7b6310"

RPROVIDES:${PN} += "mujs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8"

inherit rpm
