SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg4_4-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "51532331694b6fedda20a89df075ae332f1de6cac83f30ca7f3eab338e3e48a06e283899ad5155802d45393a2e6e1fc7871e3041e711522263a39c5b76ca680f"

RPROVIDES:${PN} += "liballeg.so.4.4 \
liballeg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
