SUMMARY = "Command-line interface for controlling river"
DESCRIPTION = "A command-line utility used to control and configure river over the Wayland protocol."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-riverctl-0.2.4+g109-3.1.aarch64.rpm"
RPM_HASH = "18d7520c625499754b2ff12a82fbf26f78caccf6ff348b767fa6fd3fc0c59f383bbdd42ccbee1f18ed9410f613b8586743d7f45a5e0e33fe51faafef44a4b071"

RPROVIDES:${PN} += "river-riverctl \
river-riverctl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwayland-client.so.0()(64bit) \
river"

inherit rpm
