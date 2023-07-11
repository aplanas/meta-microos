SUMMARY = "Remote shell program that uses munge authentication"
DESCRIPTION = "Remote shell programs that use munge authentication rather than \
reserved ports for security."
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-2.12-13.4.aarch64.rpm"
RPM_HASH = "9f902f9c5838d08f314f899409e62b12c6611e0051f0fc3bd9dc64ff2960a843b8cd0d2fc357dec2709cd81cd107d55046fbfeb9a20e418cc816f5bafb41a1f1"

RPROVIDES:${PN} += "mrsh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2"

inherit rpm
