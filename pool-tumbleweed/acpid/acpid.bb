SUMMARY = "Daemon to execute actions on ACPI events"
DESCRIPTION = "ACPID is a flexible, extensible daemon for delivering ACPI events. It \
listens to a file (/proc/acpi/event) and, when an event occurs, \
executes programs to handle the event. The start script loads all \
needed modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.34"

RPM_NAME = "acpid-2.0.34-2.2.aarch64.rpm"
RPM_HASH = "0a83e7a8a94a1d7526e7ff5098584a40bca72b0d030135c176034d4eda2b95f74be32bf650df6b18fc81b2e4547c198e6e823c3058edda4c0582142c0d257a5a"

RPROVIDES:${PN} += "acpid \
config-acpid"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
