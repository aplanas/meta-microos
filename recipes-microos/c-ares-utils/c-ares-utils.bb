SUMMARY = "Tools for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides some tools that make use of c-ares."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "c-ares-utils-1.19.1-1.1.aarch64.rpm"
RPM_HASH = "a0e283eaa58d522cbdf814837ba5b783e78aa556148cd015e637a56a8e550ea1b8eaf23e887b82aba4823871f48b772e243a0c49799a3ef92aa828ae3a968a43"

RPROVIDES:${PN} += "c-ares-utils c-ares-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit)"

inherit rpm
