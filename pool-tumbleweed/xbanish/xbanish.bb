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

RPM_NAME = "xbanish-1.8-1.7.aarch64.rpm"
RPM_HASH = "fd0ffc0c67e2fc462db89cc9477aaeda4866c1e36157d116775f40b0734ceb6519a68722837a5ee052c3e8efead6b36c5d1f2f8bdf07d4685d99ff5f77ac0800"

RPROVIDES:${PN} += "xbanish \
xbanish(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
