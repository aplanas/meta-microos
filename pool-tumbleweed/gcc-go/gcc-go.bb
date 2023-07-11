SUMMARY = "The system GNU Go Compiler"
DESCRIPTION = "The system GNU Go Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-go-13-1.5.aarch64.rpm"
RPM_HASH = "5f3a202e72b2c3a8d83d1690c4328e7a2f00b8e51233343ac8503b20100557894907f8a11fcb5793abeeb98927d81916e63f4dc1ab54108626d25148daa8582b"

RPROVIDES:${PN} += "gcc-go"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
gcc13-go \
update-alternatives"

inherit rpm
