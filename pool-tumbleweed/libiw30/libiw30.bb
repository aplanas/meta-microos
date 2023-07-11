SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw30-30.pre9-40.8.aarch64.rpm"
RPM_HASH = "5eb11ee793bbd43f6cf9f12e88663fb984b17dd329b8f4b2972b0f2a4017b18f8a9a6d83c62175357318d4b46309cb524ac1a81bee3fbbab2899cd344de6d055"

RPROVIDES:${PN} += "libiw \
libiw.so.30 \
libiw30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
