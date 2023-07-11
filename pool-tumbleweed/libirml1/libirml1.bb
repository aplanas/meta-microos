SUMMARY = "Threading Building Blocks (TBB) - IPC Library"
DESCRIPTION = "This subpackage provides the library required in order to enable inter-process \
(IPC) coordination between oneTBB schedulers for the TBB python module."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "libirml1-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "868edc2d01349c86567d17c7a093ef3076b997eb118b7541b2ba354ce05849932d07de3e429f8a6448dea22daf8e602bc6f2be3178b336bf01c164f7a86d9fd0"

RPROVIDES:${PN} += "libirml.so.1 \
libirml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
