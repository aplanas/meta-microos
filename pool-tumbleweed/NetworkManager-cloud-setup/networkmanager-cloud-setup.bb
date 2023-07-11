SUMMARY = "Automatically configure NetworkManager in cloud"
DESCRIPTION = "Installs a nm-cloud-setup tool that can automatically configure \
NetworkManager in cloud setups. Currently only EC2 is supported. \
This tool is still experimental."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-cloud-setup-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "a818f7de38c81cab6d6348c79f7e995e13ed5f69ac899031345dbddf63497dc0e77e538c65080c148e5d2b4f3d1e64b971a35f7e559f4516500dae543e0df415"

RPROVIDES:${PN} += "NetworkManager-cloud-setup"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libnm0"

inherit rpm
