SUMMARY = "Development Package for AAlib"
DESCRIPTION = "Files needed for developing software that uses AAlib."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-devel-1.4.0-513.4.aarch64.rpm"
RPM_HASH = "d8590fc6d019c2e16c3f45a0751319f40125ec35903e0ad6654810996f3f37bf1587e29c3145adb64d1783fe4b9bff0a2102132d6688de6cb760380147f362b8"

RPROVIDES:${PN} += "aalib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libaa1"

inherit rpm
