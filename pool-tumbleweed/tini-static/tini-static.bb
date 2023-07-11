SUMMARY = "A tiny but valid init for containers, with libc linked statically"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
This variant is statically linked to libc so that it will not be \
needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-static-0.19.0-2.2.aarch64.rpm"
RPM_HASH = "b0ca4c64eac5ff4f09d7f679262f979438296cc6ef0f6f91c9ebcd2cf3a57b45dacf7d60db101f6279e8e7231cf6974d067f0c8d7f086dbee323de954bf14725"

RPROVIDES:${PN} += "tini-static"

RDEPENDS:${PN} += ""

inherit rpm
