SUMMARY = "X current working directory"
DESCRIPTION = "xcwd is a simple tool which print the current working directory of the currently focused window."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "xcwd-1.0-1.9.aarch64.rpm"
RPM_HASH = "311b40dd53a8f02660dc28d4602daf32f0584ae5c5ef67d1a7af49278db5699de211a1e7d9c1403f386a2c3fb579c3442488a20670d0d8b115db95e76e03afa2"

RPROVIDES:${PN} += "xcwd"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
