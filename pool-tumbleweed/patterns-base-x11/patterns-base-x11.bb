SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-20200505-42.1.aarch64.rpm"
RPM_HASH = "1c55c735d5f1d74f797d76257d1bd78b4815d293bc1b33c7c69c9cb19a22f3fb68db729c230fddb5800f7597a6e4ad2a4ccaca78be936c34e4a2a68289a44d79"

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
