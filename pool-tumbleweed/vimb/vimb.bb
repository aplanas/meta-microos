SUMMARY = "The vim-like browser"
DESCRIPTION = "vimb is a WebKit-based web browser that behaves like the vimperator \
plugin for Firefox, and has usage paradigms from the editor vim."
LICENSE = "GPL-3.0-or-later"

PV = "3.6.0"

RPM_NAME = "vimb-3.6.0-2.10.aarch64.rpm"
RPM_HASH = "68c97192b73615237ae674a6f911c93bbaf3f8432219cfa1d9d2d0beb56e316a2d5229878c97184dd8dc3159de38ae1ad5967e8f29d12157dba0382b34ba1ccf"

RPROVIDES:${PN} += "vimb"

RDEPENDS:${PN} += "libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libsoup-2.4.so.1 \
libwebkit2gtk-4.0.so.37"

inherit rpm
