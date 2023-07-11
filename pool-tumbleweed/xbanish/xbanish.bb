SUMMARY = "Program to hide the mouse cursor when typing"
DESCRIPTION = "xbanish hides the mouse cursor when you start typing, and shows it again when \
the mouse cursor moves or a mouse button is pressed.  This is similar to \
xterm's pointerMode setting, but xbanish works globally in the X11 session. \
 \
unclutter's -keystroke mode is supposed to do this, but it's broken[0].  I \
looked into fixing it, but the unclutter source code is terrible, so I wrote \
xbanish in a few hours. \
 \
The name comes from ratpoison's 'banish' command that sends the cursor to the \
corner of the screen."
LICENSE = "ISC"

PV = "1.8"

RPM_NAME = "xbanish-1.8-1.8.aarch64.rpm"
RPM_HASH = "5ca20639f02fdce6f861d30663ffd446da06eea06c7171c600154ee797e07cc3a156fb2b5a5ae4f789c53f3abaa084f14020e6f0686b7f6d28e68406b3afb38f"

RPROVIDES:${PN} += "xbanish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6"

inherit rpm
