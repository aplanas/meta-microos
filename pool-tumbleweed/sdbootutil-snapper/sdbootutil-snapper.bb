SUMMARY = "plugin script for snapper"
DESCRIPTION = "Plugin scripts for snapper to handle BLS config files"
LICENSE = "MIT"

PV = "1+git20230717.dac075e"

RPM_NAME = "sdbootutil-snapper-1+git20230717.dac075e-1.1.aarch64.rpm"
RPM_HASH = "5b5220deb6a2aa8715c2b1e02f455224e3d8fc70b6d18c44295e24b8b0f686598335978d3e76423752f59797089e18e61128cf94073fb41be739ef4831174c18"

RPROVIDES:${PN} += "sdbootutil-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
btrfsprogs \
sdbootutil \
snapper"

inherit rpm
