SUMMARY = "Shared libraries for Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains the shared libraries needed by programs built \
with newt. \
 \
Newt is a programming library for color text-mode widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "libnewt0_52-0.52.23-2.1.aarch64.rpm"
RPM_HASH = "7d9d2de865d8060a23624f37dbf3131f1b8dca87644b2cb8546d27892085f313ae86da32d110016fc156d2e0a525cc18aea3fee82ad811f16e1a486a98993e6c"

RPROVIDES:${PN} += "libnewt.so.0.52()(64bit) \
libnewt.so.0.52(NEWT_0.52)(64bit) \
libnewt.so.0.52(NEWT_0.52.11)(64bit) \
libnewt.so.0.52(NEWT_0.52.13)(64bit) \
libnewt.so.0.52(NEWT_0.52.16)(64bit) \
libnewt.so.0.52(NEWT_0.52.17)(64bit) \
libnewt.so.0.52(NEWT_0.52.6)(64bit) \
libnewt.so.0.52(NEWT_0.52.9)(64bit) \
libnewt0_52 \
libnewt0_52(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libslang.so.2()(64bit) \
libslang.so.2(SLANG2)(64bit)"

inherit rpm
