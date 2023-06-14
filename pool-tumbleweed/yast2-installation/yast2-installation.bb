SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "4.6.3"

RPM_NAME = "yast2-installation-4.6.3-1.1.noarch.rpm"
RPM_HASH = "dd97e48e21d18acadc6af7f1c2ebb8bd97eadfb55f822e96379cb89be1705fa59539d1c2268493c8675fc9a32b91f8833212de7976dd9ed6a809c82f12b785e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-installation"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/ruby \
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
