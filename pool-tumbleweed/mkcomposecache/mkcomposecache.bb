SUMMARY = "Utility to create Compose cache files"
DESCRIPTION = "mkcomposecache is used for creating global (system-wide) Compose cache files. \
 \
Compose cache files help with application startup times and memory usage, \
especially in locales with large Compose tables (e.g. all UTF-8 locales)."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "mkcomposecache-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "6a4c0a1990159d9b37b18b73e7c4e335f3fe434275359d0115efca6aeda098774b95413f162e7aae57983c18dad75609d66912c3ab1b4526008b5ce09afdd875"

RPROVIDES:${PN} += "mkcomposecache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
