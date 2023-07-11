SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-altera-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "75f9f105d7fb6454cfacbbf0023ee7007552547606d3b488dc7725d1d4f0b6af55b0b13f605dcfc42e5d3e716d9e324d4713711cef34e513cf5f7ffc6124e481"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
