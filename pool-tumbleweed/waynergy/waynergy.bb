SUMMARY = "Synergy client for wayland compositors"
DESCRIPTION = "An implementation of a synergy client for wayland compositors. Based \
on the upstream uSynergy library (heavily modified for more protocol \
support and a bit of paranoia). \
 \
NOTE: See README.md for using uinput."
LICENSE = "MIT"

PV = "0.16+3"

RPM_NAME = "waynergy-0.16+3-1.1.aarch64.rpm"
RPM_HASH = "3013ae717a18bc6e6827cde2ead45d52b5df7e9e119cc0b9ca64eefe8e6c505290014f5b357f00d509364418aa8b3be5afb1de8919c4dcea1041d35b5f6f513f"

RPROVIDES:${PN} += "waynergy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtls.so.26 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
