SUMMARY = "Automatically configure NetworkManager in cloud"
DESCRIPTION = "Installs a nm-cloud-setup tool that can automatically configure \
NetworkManager in cloud setups. Currently only EC2 is supported. \
This tool is still experimental."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-cloud-setup-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "013b4cec312a80ecb63af7d54d79b8eac0d6662399231b1106b4441ce3e49f02439277e8e4e29f0f6a724d2d0fe523d214e1c695ef127698280c9b5109f4e4e8"

RPROVIDES:${PN} += "NetworkManager-cloud-setup"

RDEPENDS:${PN} += "/bin/sh \
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
