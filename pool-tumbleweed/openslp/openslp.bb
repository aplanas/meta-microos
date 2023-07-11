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

RPM_NAME = "openslp-2.0.0-21.5.aarch64.rpm"
RPM_HASH = "4b706f9b8af749a49da25a2e8b7dc5cc58208caecc90a8bb779ec02ed0009f839af28630a030bb8e48c17dda85961f0ab89423ed9653e473d3b7ea3e833eeef1"

RPROVIDES:${PN} += "config-openslp \
openslp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslp.so.1"

inherit rpm
