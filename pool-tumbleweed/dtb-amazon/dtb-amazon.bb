SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-amazon-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "178d97c0061b176453381a15ec01aaa3b19df2a5abc71fb25c75a65833d29bc69a4557a2b301856d7856958bd5c3ab97e37e6c761b81081519b55cef4db42770"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
