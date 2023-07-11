SUMMARY = "Simple GUI Frontend to x11vnc"
DESCRIPTION = "x11vnc allows one to remotely view and interact with real X displays (i.e. a \
display corresponding to a physical monitor, keyboard, and mouse) with any VNC \
viewer. In this way it plays the role for Unix/X11 that WinVNC plays for \
Windows. \
 \
This package adds a simple GUI frontend to run x11vnc."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.16"

RPM_NAME = "x11vnc-frontend-0.9.16-2.14.aarch64.rpm"
RPM_HASH = "7eb112078f498b30ae0221c15ff17696f463bd8a0a3f9603d20c9dec7287a7054f5ae9c715f5453cc775f87770f502efd6b3a081b29042fc7265ea3ca435b6c2"

RPROVIDES:${PN} += "x11vnc-frontend"

RDEPENDS:${PN} += "/usr/bin/sh \
tcl \
tk \
x11vnc"

inherit rpm
