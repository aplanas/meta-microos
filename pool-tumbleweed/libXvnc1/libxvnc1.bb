SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "libXvnc1-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "cd968b272b85efc7703674d013ca643ef280a81ad5d35237aeb7d6e2d7a8b7fda5992b24b068bba278cfdf3b24ae1cc0b1ef97cfb79fbcb49f9f0f285a046527"

RPROVIDES:${PN} += "libXvnc.so.1 \
libXvnc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
