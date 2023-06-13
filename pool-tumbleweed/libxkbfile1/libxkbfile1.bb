SUMMARY = "X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libxkbfile1-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "cf403f2b310322c391ca9cad5df6036bf748b0208f49b3e19fa1c651aafcc4014854c76f3037cc551a6b2da6980f73e582d36b2f14b4fbd753642078034ee92f"

RPROVIDES:${PN} += "libxkbfile.so.1()(64bit) \
libxkbfile1 \
libxkbfile1(aarch-64) \
xorg-x11-libxkbfile"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
xkeyboard-config"

inherit rpm
