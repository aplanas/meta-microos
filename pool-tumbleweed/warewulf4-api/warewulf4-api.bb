SUMMARY = "Contains the service for the warewulf rest API"
DESCRIPTION = "Containts the binaries for the access of warewulf through a rest API and from the commandline from an external host."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-api-4.4.0-6.5.aarch64.rpm"
RPM_HASH = "6197fd7030de24b5ca2ffadc9562ad9328b176a1e5016f655a0735b1fe4e07c9a302149a8d41c789b719f9e56768e4e966d27b06cd2028b78d93f4bce56ce2df"

RPROVIDES:${PN} += "config-warewulf4-api \
warewulf4-api"

RDEPENDS:${PN} += "libc.so.6 \
libgpgme.so.11 \
warewulf4"

inherit rpm
