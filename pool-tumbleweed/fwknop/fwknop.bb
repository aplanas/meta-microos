SUMMARY = "The fwknop Client"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "fwknop-2.6.10-3.9.aarch64.rpm"
RPM_HASH = "c641eccab9c4336eb86346259454ad46f81e6c648222a510505838e8c35ab2dcb4c0de90fb29fe3eee9ccfb4dfd9be041ec4606178b401c16c41f7c4bbca9495"

RPROVIDES:${PN} += "fwknop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfko.so.3"

inherit rpm
