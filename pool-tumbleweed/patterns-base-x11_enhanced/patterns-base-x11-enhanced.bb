SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-20200505-42.1.aarch64.rpm"
RPM_HASH = "ada89700f0250726a5adf7973d6d7804c7376dd37c2092791b64314ef1053f66b226a4bcc3f669b950868ba78f123c70c3df072aa813feb5db41c7534bb14414"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-base-x11-enhanced"

RDEPENDS:${PN} += "glibc-locale \
glibc-locale-base \
pattern- \
xkeyboard-config \
xorg-x11-essentials"

inherit rpm
