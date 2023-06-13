SUMMARY = "Linux Trace Toolkit Next Generation control and utility library"
DESCRIPTION = "This package provides a userspace library for controlling the LTTng \
subsystem. It is primarily intended for use by the lttng-tools \
package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "liblttng-ctl0-2.13.9-1.3.aarch64.rpm"
RPM_HASH = "fde8d5b7698435cab2c93e2aa983e0e956053ea9d816bfeb801cdf87ad6d41ab20489b42855a0a290ee1ac4dd4bf872c964375837a3e5056056a7ba182a1f551"

RPROVIDES:${PN} += "liblttng-ctl.so.0()(64bit) \
liblttng-ctl0 \
liblttng-ctl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
