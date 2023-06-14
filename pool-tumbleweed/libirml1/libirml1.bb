SUMMARY = "Threading Building Blocks (TBB) - IPC Library"
DESCRIPTION = "This subpackage provides the library required in order to enable inter-process \
(IPC) coordination between oneTBB schedulers for the TBB python module."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "libirml1-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "bb7a351a133af8564e637c8d8eb8821a21e9b03b43da26a37a9191d04fab0e8f1f9d053da7f97b0335a604827215d7255498851b61b45f6a3a7b86956a772e9c"

RPROVIDES:${PN} += "libirml.so.1 \
libirml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
