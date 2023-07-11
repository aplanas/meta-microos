SUMMARY = "MMS stream protocol library"
DESCRIPTION = "LibMMS is a common library for parsing mms:// and mmsh:// type network streams. \
These are commonly used to stream Windows Media Video content over the web. \
LibMMS itself is only for receiving MMS stream, it doesn't handle sending at \
all."
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms0-0.6.4-5.27.aarch64.rpm"
RPM_HASH = "7874392c40972c98d8bced3ede611d069b7a6438331323a4dc7fbd21d9956a5b2c0237d248086fe111fb72322ffabcbb52067edad783f8cc730eddb4bc5885ec"

RPROVIDES:${PN} += "libmms.so.0 \
libmms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
