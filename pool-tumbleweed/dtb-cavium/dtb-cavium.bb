SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-cavium-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "19d21ebaba9c57d56dceaa1e6afe2f8920e5b7c0baa8bd01c9b53088d8b1559b9d40f1e7e86c6aa8fc0a59cb0017dedb4cd72cdb7caa5add5cca551bb4de657a"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
