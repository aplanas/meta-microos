SUMMARY = "Generic helper tool to build app in a distributable format"
DESCRIPTION = "Generic helper tool to build app in a distributable formats. \
Used by electron-builder but applicable not only for building Electron applications."
LICENSE = "MIT"

PV = "3.4.2^20220309g4e2aa6a1"

RPM_NAME = "app-builder-3.4.2^20220309g4e2aa6a1-1.7.aarch64.rpm"
RPM_HASH = "f27e24490192472d01f9ce443ebc27d49887d5f6dd8933b73d9cee5b8404ef0f8a4388873931d8c1b643489fcd2762c26d7e697557b7259925e04d96c4933486"

RPROVIDES:${PN} += "app-builder"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
