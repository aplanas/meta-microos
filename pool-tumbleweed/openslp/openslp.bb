SUMMARY = "An Implementation of Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
OpenSLP is an open source implementation of the SLPv2 protocol as \
defined by RFC 2608 and RFC 2614.  This package includes the slptool \
and runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-2.0.0-21.4.aarch64.rpm"
RPM_HASH = "a3b1af93ba18a87d67f80e4bfcc84327d2d57b501ac97de2a97edf0effc7d03b61d06fbddd6ce5aa789099267b87e03cc2a8685f745dc0edf6abc9673d2f0e2e"

RPROVIDES:${PN} += "config(openslp) \
openslp \
openslp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libslp.so.1()(64bit)"

inherit rpm
