SUMMARY = "Distributed Lock Manager"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. It supports networking, abstract \
resources, offers a library, encryption and peer authentication."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-1.6.1-1.1.aarch64.rpm"
RPM_HASH = "f029ae13eb56577c24394406fcc775f5b13ca3ed94da1609c38b3f55317978aefba8d71b15e56ae78413cfa277df3674ff0006ad4f8cb33a3049dbc57e0e4daa"

RPROVIDES:${PN} += "flom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflom.so.0 \
libglib-2.0.so.0"

inherit rpm
