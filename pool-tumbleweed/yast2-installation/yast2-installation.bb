SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "yast2-installation-4.6.5-1.1.noarch.rpm"
RPM_HASH = "e8ee3f6b136900a37b23166ac8712ceb858aa14da8b00a47d2bf1bb615d7548cced87034553130ff5588bdd702a7bce9841907ef46e87ebabc53cef2160244cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-installation"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/touch \
augeas-lenses \
coreutils \
fillup \
gzip \
initviocons \
iproute2 \
pciutils \
systemd \
tar \
yast2 \
yast2-bootloader \
yast2-country \
yast2-country-data \
yast2-network \
yast2-packager \
yast2-pkg-bindings \
yast2-proxy \
yast2-ruby-bindings \
yast2-security \
yast2-services-manager \
yast2-storage-ng \
yast2-users"

inherit rpm
