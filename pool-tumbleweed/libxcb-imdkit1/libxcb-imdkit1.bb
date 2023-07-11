SUMMARY = "An implementation of xim protocol in xcb"
DESCRIPTION = "xcb-imdkit is an implementation of xim protocol in xcb, comparing with the \
implementation of IMDkit with Xlib, and xim inside Xlib, it has less memory \
foot print, better performance, and safer on malformed client."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libxcb-imdkit1-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "cc30b23ab5f3733353050679eea588d1a0cab194a7ace5556e444771d41af70f138726b0e6da68d66a09a6852dc3724e30616e94a8930b2dc602f35e9c0ae750"

RPROVIDES:${PN} += "libxcb-imdkit.so.1 \
libxcb-imdkit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
