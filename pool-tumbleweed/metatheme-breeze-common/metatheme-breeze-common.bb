SUMMARY = "GTK+ theme matching KDE's Breeze -- Common Files"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.6"

RPM_NAME = "metatheme-breeze-common-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "07533fa5b5f0deb1aa82e9e124efbf2857ce623fdfc4ebbcb60163462cb2a7235225a83ffd28c8e71e90c5f5d94ac64e6b21e900588524a0849d68632c9da833"

RPROVIDES:${PN} += "breeze-gtk \
metatheme-breeze-common"

RDEPENDS:${PN} += ""

inherit rpm
