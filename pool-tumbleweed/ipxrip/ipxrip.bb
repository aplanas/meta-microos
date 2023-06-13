SUMMARY = "IPX Routing Daemon"
DESCRIPTION = "This is an RIP/SAP daemon for Linux. With this daemon, you can turn \
your Linux machine into an IPX router."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ipxrip-0.7-1016.27.aarch64.rpm"
RPM_HASH = "31376ae74300e89b5789e7af7a9e5656b6a780a0ee6ab095f2d4a7622fa4f4a17fa1efbdc23c16e4f1acca01b7280cf10b4b87ad82dab6c1e9e405f680793de5"

RPROVIDES:${PN} += "config(ipxrip) \
ipxrip \
ipxrip(aarch-64) \
ipxripd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
