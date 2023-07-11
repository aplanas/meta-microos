SUMMARY = "Record or play back a VNC session"
DESCRIPTION = "rfbproxy is a simple proxy for VNC which allows recording of screen \
updates, key presses and mouse events for later replay. \
 \
 \
 \
Authors: \
-------- \
    Tim Waugh <twaugh@redhat.com>"
LICENSE = "GPL-2.0+"

PV = "1.1.0"

RPM_NAME = "rfbproxy-1.1.0-52.27.aarch64.rpm"
RPM_HASH = "5dc5b04c65e0b908107c6b79c8774419e0abe38ecdc7168547a49d67f938568e8033fb57e8105dc4b2ebf6e308d3a273dce05db5f93bd2a2ad88571c5fb72ce7"

RPROVIDES:${PN} += "rfbproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
