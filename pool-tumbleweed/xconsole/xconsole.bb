SUMMARY = "Utility to monitor system console messages with X"
DESCRIPTION = "xconsole displays in a X11 window the messages which are usually sent \
to /dev/console"
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xconsole-1.0.8-1.3.aarch64.rpm"
RPM_HASH = "ec91276623daa15c2fdc5d497f3a88ada27df70a43fefdddb5edba7a95fc96cf8a916f08a1d8e198d59e0520ed22b354ef797e4f49f2e8abd2406d04b9c89185"

RPROVIDES:${PN} += "xconsole"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
