SUMMARY = "Tools for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides some tools that make use of c-ares."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "c-ares-utils-1.19.0-2.3.aarch64.rpm"
RPM_HASH = "71d87ecf908c185c8faf47ccc8d3427909421104ac320eb0bdc90b0c0317925383ce3614969af033ba2e99f493fc82b6b8e6db956b1c6b293f09af570f19961b"

RPROVIDES:${PN} += "c-ares-utils c-ares-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit)"

inherit rpm
