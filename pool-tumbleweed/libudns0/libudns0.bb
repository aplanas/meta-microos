SUMMARY = "DNS resolver library"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "libudns0-0.4-2.14.aarch64.rpm"
RPM_HASH = "23cc54668719def991c4f1ff0ae026ad11b7dac65dc3914950eea38d777262a42e82fe3e3de66eede2dd7d9518ef0c2970b93e86965be9cbf27ace6cff6ede3c"

RPROVIDES:${PN} += "libudns.so.0()(64bit) \
libudns0 \
libudns0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
