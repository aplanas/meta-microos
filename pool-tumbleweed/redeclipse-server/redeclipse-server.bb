SUMMARY = "The Red Eclipse server binary"
DESCRIPTION = "This package contains the server binary for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-server-2.0.0-4.6.aarch64.rpm"
RPM_HASH = "1971cab7dd2c9a76fe8c20e1f819fba3d0f664ef1cddc91c53af3e749845178a3f7abad575aeef1618fffa03d79dbe24f26fead7d40a1862c924152ba7ffba1c"

RPROVIDES:${PN} += "redeclipse-server"

RDEPENDS:${PN} += "/usr/bin/sh \
redeclipse-data"

inherit rpm
