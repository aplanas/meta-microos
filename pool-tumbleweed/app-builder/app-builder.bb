SUMMARY = "Generic helper tool to build app in a distributable format"
DESCRIPTION = "Generic helper tool to build app in a distributable formats. \
Used by electron-builder but applicable not only for building Electron applications."
LICENSE = "MIT"

PV = "3.4.2^20220309g4e2aa6a1"

RPM_NAME = "app-builder-3.4.2^20220309g4e2aa6a1-1.6.aarch64.rpm"
RPM_HASH = "9d43934a7181c28a70e3f708c2f85f1ca32ea7f845cc202b6cd09df11f0f9a9ba17433d0d329764d13a75fc18b139f46d8fb7a454896076bd5ad39a35970d4b5"

RPROVIDES:${PN} += "app-builder"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
