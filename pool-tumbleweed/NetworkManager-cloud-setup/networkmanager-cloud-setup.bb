SUMMARY = "Automatically configure NetworkManager in cloud"
DESCRIPTION = "Installs a nm-cloud-setup tool that can automatically configure \
NetworkManager in cloud setups. Currently only EC2 is supported. \
This tool is still experimental."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-cloud-setup-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "d8b261c32d110a527586e6c1fd440e3b9d418eb258fa2559ff734884844fa9744d76f00b60dc6cb577bf2531b53df20296ddcd8f1bb6c4faf5004463623e795d"

RPROVIDES:${PN} += "NetworkManager-cloud-setup"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libnm0"

inherit rpm
