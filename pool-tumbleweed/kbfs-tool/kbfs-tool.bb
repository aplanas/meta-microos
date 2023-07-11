SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-tool-6.0.2-3.5.aarch64.rpm"
RPM_HASH = "a3f864c72194008d700276096526246c8fbce735411a8fe794dc80d48ee4581e500b66c6ff6c3b62a729d7448456ef0378232bb1cdfac03b10ef0dbe7907ae9a"

RPROVIDES:${PN} += "kbfs-tool"

RDEPENDS:${PN} += "keybase-client"

inherit rpm
