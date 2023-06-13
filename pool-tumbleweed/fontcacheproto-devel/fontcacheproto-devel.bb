SUMMARY = "The X11 Protocol: Fontcache extension"
DESCRIPTION = "The Fontcache protocol headers for X11 development."
LICENSE = "BSD-2-Clause"

PV = "0.1.3"

RPM_NAME = "fontcacheproto-devel-0.1.3-4.18.aarch64.rpm"
RPM_HASH = "ebef4c2434b4eea5f0ff80451274fabe739be30e044501cd529065f3bff96df44c753049a10b1226a258957312af3a9e82007721cf623ae6212abb0a356726aa"

RPROVIDES:${PN} += "fontcacheproto-devel \
fontcacheproto-devel(aarch-64) \
pkgconfig(fontcacheproto) \
xorg-x11-proto-devel:/usr/lib64/pkgconfig/fontcacheproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
