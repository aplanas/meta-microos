SUMMARY = "Threading Building Blocks (TBB) - IPC Library"
DESCRIPTION = "This subpackage provides the library required in order to enable inter-process \
(IPC) coordination between oneTBB schedulers for the TBB python module."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "libirml1-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "39b5ceb9eb9aefd8fc96d4516425e274208ba3aaa764ed9984facb33ac9dbb38dfede9124128fcaa0b7685c00486f88f793b4b29c01073f35751f05ae2bb1660"

RPROVIDES:${PN} += "libirml.so.1 \
libirml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
