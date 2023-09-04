SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "4.6.7"

RPM_NAME = "yast2-installation-4.6.7-1.1.noarch.rpm"
RPM_HASH = "4c8b4397ed5d2140a40975ab393eaa2c49fcd7fb2e164ba6c890a13588abd9e4a20365d7f74321b71d356acfa1b77490b0d6fd7b80ed11dd3d3ee4c28a5489e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-installation"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/touch \
augeas-lenses \
awk \
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
