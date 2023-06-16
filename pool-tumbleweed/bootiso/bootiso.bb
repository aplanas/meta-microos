SUMMARY = "A bash script to securely create a bootable USB device from one image file"
DESCRIPTION = "A bash program to securely and easily create a bootable USB device from one image file"
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-4.2.0-2.8.noarch.rpm"
RPM_HASH = "b3a921095970c3dcaab0f68713e622bee060438b2a441a06b9131efdc50ead06c52e7d0cd403fb0a33d6da51e3fe9c184a78bb0d65943731c856b90b6dc4bb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
jq \
syslinux \
wimtools"

inherit rpm
