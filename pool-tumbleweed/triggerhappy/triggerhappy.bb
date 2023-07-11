SUMMARY = "Lightweight hotkey daemon"
DESCRIPTION = "Triggerhappy \
- a lightweight hotkey daemon - \
 \
by Stefan Tomanek <stefan.tomanek+th@wertarbyte.de> \
http://github.com/wertarbyte/triggerhappy/ \
 \
Triggerhappy is a hotkey daemon developed with small and embedded systems in \
mind, e.g. linux based routers. It attaches to the input device files and \
interprets the event data received and executes scripts configured in its \
configuration."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "triggerhappy-0.5.0-3.4.aarch64.rpm"
RPM_HASH = "dff5dad79823b4991dad9cbd749e1f3574be4fe7c82d7ce46945b9772d5def86805d655e55c0251e429ba457e9ffbbce9574f4aac63f930c520ded2b466bf5ab"

RPROVIDES:${PN} += "triggerhappy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libsystemd.so.0"

inherit rpm
