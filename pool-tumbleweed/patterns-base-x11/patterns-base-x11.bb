SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-20200505-41.1.aarch64.rpm"
RPM_HASH = "b087ef8a93869f2327d36654e1960f672639efb56aadd369450eeb0f55f53930ba9e250564ccfcbea8bb1cd59a7b368fe5b3680a27b8eeb2172242318d6578b9"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-x11 \
patterns-openSUSE-x11"

RDEPENDS:${PN} += "pattern- \
xf86-input-libinput \
xorg-x11-fonts-core \
xorg-x11-server"

inherit rpm
