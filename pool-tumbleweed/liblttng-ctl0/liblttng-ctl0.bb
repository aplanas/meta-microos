SUMMARY = "Linux Trace Toolkit Next Generation control and utility library"
DESCRIPTION = "This package provides a userspace library for controlling the LTTng \
subsystem. It is primarily intended for use by the lttng-tools \
package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "liblttng-ctl0-2.13.9-1.5.aarch64.rpm"
RPM_HASH = "1440cde0ea94c69614a636921498439bfe5af5145bdf7d00312863ed567108c8dda5a3097c1d48af5ed11f7a29e01e87e9761c985f56fdc302cbc4c0a7eef989"

RPROVIDES:${PN} += "liblttng-ctl.so.0 \
liblttng-ctl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
