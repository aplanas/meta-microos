SUMMARY = "Jack Audio Connection Kit D-Bus support"
DESCRIPTION = "This package contains the D-Bus support for JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "jack-dbus-1.9.22-2.2.aarch64.rpm"
RPM_HASH = "a49fa954f0075bfd3a2ebd7aa2c63d169e5afeca8d3972d595570f23a1cb9a1afe5236a1215f67ed199a0e4bb97150e1e5afadc4aeccc6a11a4e60f385d683c2"

RPROVIDES:${PN} += "jack-dbus"

RDEPENDS:${PN} += "/usr/bin/python3 \
jack-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libjackserver.so.0"

inherit rpm
