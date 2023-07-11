SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "4.6.4"

RPM_NAME = "yast2-installation-4.6.4-1.1.noarch.rpm"
RPM_HASH = "944bc2b16d3bb6b7d7182f4ed2658d21c4d18e8db15de944f947b8bc7d45eb555710ac348aa46e93d7f9a7b0927708d6a6bec5a75a98f21bab7009333667e1ba"
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
