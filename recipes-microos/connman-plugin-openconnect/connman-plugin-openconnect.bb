SUMMARY = "OpenConnect plugin for connman"
DESCRIPTION = "Provides OpenConnect support for Connman (Connection Manager). \
OpenConnect is an open client for Cisco(TM) AnyConnect(TM) VPN."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-openconnect-1.41-4.7.aarch64.rpm"
RPM_HASH = "a21b4b3a86bb924603bda0dc8667a6cad3c8e33b97119f6813273e4fe55fd2f5f1ed7352248f2b2a072e47970fb0f9215e928f5436a301dd65bc4b7b981901e0"

RPROVIDES:${PN} += "connman-plugin-openconnect connman-plugin-openconnect(aarch-64)"
RDEPENDS:${PN} += "connman dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libopenconnect.so.5()(64bit) libopenconnect.so.5(OPENCONNECT_5.0)(64bit) libopenconnect.so.5(OPENCONNECT_5_3)(64bit) libopenconnect.so.5(OPENCONNECT_5_5)(64bit) openconnect"

inherit rpm
