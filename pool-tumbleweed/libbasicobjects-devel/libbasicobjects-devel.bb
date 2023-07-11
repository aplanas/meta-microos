SUMMARY = "Library containing basic objects like dynamic string"
DESCRIPTION = "A small library that provides a buffer object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libbasicobjects-devel-0.1.1-28.1.aarch64.rpm"
RPM_HASH = "8cd31077d4d850228e2a2d8ff666cd5f1619f1be0d69e352f16e9fc2d4c2c00d44975c5ea233dca6c0bdcb968d82b9b1f92378b126d531dbe5cb3b06927e552e"

RPROVIDES:${PN} += "libbasicobjects-devel \
pkgconfig-basicobjects"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbasicobjects0"

inherit rpm
