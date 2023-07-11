SUMMARY = "Simple font tester"
DESCRIPTION = "Simple font tester \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftlint-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "2fc563bd748d8c2b284b82100b8ba8b190688e946b848e0afa4aae30baf79f08cfde0dbc5f71c01e46044322b3ce4e3a54311ed5a787c927f6c0e5e7c7b934d6"

RPROVIDES:${PN} += "ftlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
