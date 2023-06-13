SUMMARY = "Development files for libsignal-protocol-c"
DESCRIPTION = "Development files and headers for libsignal-protocol-c"
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c-devel-2.3.3-1.13.aarch64.rpm"
RPM_HASH = "4b9072740589b04da47d9b0a7b6115e8f036c04c13cc4c3e54c4ecbddb89aa63b1a57c530a4ad469ae829f2c711b167689f5d61099d0041d752da1ab3c7fd392"

RPROVIDES:${PN} += "libsignal-protocol-c-devel \
libsignal-protocol-c-devel(aarch-64) \
pkgconfig(libsignal-protocol-c)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignal-protocol-c2"

inherit rpm
