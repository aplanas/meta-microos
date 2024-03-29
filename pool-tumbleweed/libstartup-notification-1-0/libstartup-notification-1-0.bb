SUMMARY = "Reference Implementation for the Startup-Notification Protocol"
DESCRIPTION = "Startup-notification contains a reference implementation of the \
startup-notification protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12"

RPM_NAME = "libstartup-notification-1-0-0.12-16.19.aarch64.rpm"
RPM_HASH = "32fedade1a073b3700bcdb78c71d695c7d18f9e7ffa2e2feb2c0d96db8b5eef8c5160f0cd61ae5dd0f021c4d9362611c12f388789b0909f01a88e6870beffe17"

RPROVIDES:${PN} += "libstartup-notification-1-0 \
libstartup-notification-1.so.0 \
startup-notification"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libc.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
