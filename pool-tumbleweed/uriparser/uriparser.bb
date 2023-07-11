SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
There is a command line tool, uriparse, which allows parsing URIs and \
show how the liburiparser splits it into components."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.9.7"

RPM_NAME = "uriparser-0.9.7-1.4.aarch64.rpm"
RPM_HASH = "48da0737d10e15007db8755101a96b6a16fb82e04d4138a3105799e8ef02117a58951782e8abf2c8bf3be93c31c4d75babb992535baba7aa16a943b83b70f2c9"

RPROVIDES:${PN} += "uriparse \
uriparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liburiparser.so.1"

inherit rpm
