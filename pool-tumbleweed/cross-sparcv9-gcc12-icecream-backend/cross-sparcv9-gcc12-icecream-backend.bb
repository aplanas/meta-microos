SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparcv9-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "29cf9a4e7216b5c74d14a754391024c8c8b50142b8f239d248bb4d9adc16ab35fc206cfaf8d2d8c9032f2c1bcfcefa7241439733b7b14f7bf9fba59ce2526f95"

RPROVIDES:${PN} += "cross-sparcv9-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
