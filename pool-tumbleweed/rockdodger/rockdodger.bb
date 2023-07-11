SUMMARY = "Addictive rock-dodging greeblie-killing platform game"
DESCRIPTION = "Addictive rock-dodging greeblie-killing platform game. \
 \
Dodge the rocks for as long as possible until you die. Kill greeblies to \
make the universe safe for non-greeblie life once again."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "rockdodger-1.1.4-1.12.aarch64.rpm"
RPM_HASH = "9db4e4898ba2b5586d1c79f7ada4787628036611bbbeab4ac89f2a16df69246fa3dec0047994617e1539a801ba51798c94f150ad4684935ec31eebaf07058460"

RPROVIDES:${PN} += "rockdodger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
