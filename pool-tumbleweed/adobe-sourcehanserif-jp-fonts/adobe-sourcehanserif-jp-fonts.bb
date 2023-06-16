SUMMARY = "Source Han Serif JP"
DESCRIPTION = "Source Han Serif is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License, Version 1.1."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "adobe-sourcehanserif-jp-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "bb3564d22e30cec2dd6a15dc5f10614afa54238cb76e51350e74bc3218f2930714e9d43718f04d1f966afc01b3648c805e51d21b15eaa33c15f0885035391faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-jp-fonts \
locale-jp \
scalable-font-jp"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
