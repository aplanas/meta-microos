SUMMARY = "Tool that displays a cow and message on the X11 desktop"
DESCRIPTION = "xcowsay displays a cow and message on the X11 desktop. \
Inspired by the original cowsay. \
 \
xcowsay includes all these amazing features: \
- Fully configurable. \
- Calculates display time from amount of text \
- Dream mode — display images in the bubble \
- Can draw thought and speech bubbles \
- Daemon mode. Send your cow messages over DBus. \
- Three different sized cows provided \
- fortune(6) wrapper program - (unavailable temporarily) \
- Replace the naffness that is xmessage(1) \
- Should work with any window manager \
- Supports UTF-8 characters properly \
- Automatic word wrapping \
- Use alternative non-cow images if you like"
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "xcowsay-1.6-1.7.aarch64.rpm"
RPM_HASH = "6fd313d74364a40ca34f556d3779932c08193b233eefbb21e4deba5a8c9858ecc98a5bc83f4ec8f59980d861e8039074bfede79a21e4fb0e18d40083ad951790"

RPROVIDES:${PN} += "xcowsay"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
fortune \
gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
