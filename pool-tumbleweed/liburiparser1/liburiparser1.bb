SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This package contains the shared library for uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "liburiparser1-0.9.7-1.4.aarch64.rpm"
RPM_HASH = "6a69f3577d479d14e8e236fce11b5549cb82899c3f19672fe7cc5720582e5808090a484016e0329c64160f2662e90486bc6d46e4b9d1cd6537592ae2e466e586"

RPROVIDES:${PN} += "liburiparser.so.1 \
liburiparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
