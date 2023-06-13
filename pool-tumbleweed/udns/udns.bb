SUMMARY = "DNS resolver tools"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "udns-0.4-2.14.aarch64.rpm"
RPM_HASH = "5c83b92bdfa46f21853397c76d178395c3ce4118280ccde96259dccb676642577e6e1138f2ef24132fb210d0d5a399912b8aa9591c13abd38ef59817b7e75789"

RPROVIDES:${PN} += "udns \
udns(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libudns.so.0()(64bit)"

inherit rpm
