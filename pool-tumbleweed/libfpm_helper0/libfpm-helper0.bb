SUMMARY = "Mono.WebServer.FPM Helper"
DESCRIPTION = "Library of Mono.WebServer.FPM Helper."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper0-4.7.1-1.17.aarch64.rpm"
RPM_HASH = "dbe3f45482f48196184e395096c5454a2e7f78ea335b9c9330b004c44357e6e5f3adb08ea6d1a880a2ed5d30f5c8f7b9714aab1edc388845899a5a06300ffd12"

RPROVIDES:${PN} += "libfpm-helper.so.0 \
libfpm-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
