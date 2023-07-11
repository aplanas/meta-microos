SUMMARY = "MuJS development files"
DESCRIPTION = "This package provides the MuJS static library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "mujs-devel-1.3.3-1.2.aarch64.rpm"
RPM_HASH = "82b588940ce6b5f87b0a46200d759580c6b77a4961a0e17f2809ec396ae690d45c5f4757b86db265122678d28b7c7f9e9f49ed89e842c9b4d86d04184ac8d390"

RPROVIDES:${PN} += "mujs-devel \
mujs-static \
pkgconfig-mujs"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
