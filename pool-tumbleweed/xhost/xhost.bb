SUMMARY = "Utility to control X server access"
DESCRIPTION = "xhost is used to manage the list of host names or user names \
allowed to make connections to the X server."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "xhost-1.0.9-1.2.aarch64.rpm"
RPM_HASH = "377d53ee84e9f3a745024c66587a21c91af94c8e7348ff999bb7c57950924cc46b93578d55f68d41eaa50ad855d40ccf7aed95cef3ed9c5f843773aad899b3e8"

RPROVIDES:${PN} += "xhost"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
