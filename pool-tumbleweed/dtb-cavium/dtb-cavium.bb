SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-cavium-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "ec55fa22be5708991ec3d3ab6e24f62019ee2bed4e868ac69f1eeeaec35e812e661dbf40756740a98b5e79c7ba53ccbbd6ec65c00ef9f775ceea51e6f75ed7ff"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
