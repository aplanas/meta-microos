SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-1.10.0-3.4.aarch64.rpm"
RPM_HASH = "17cd2475a8a8e5db1120a2992592bd71f43dd3cd29350455b2534af7d71b80dc1bbaa101c79ba96fedd0f643a6135837cea927d84b7479fc223efce8982a9339"

RPROVIDES:${PN} += "libosinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libosinfo-1.0.so.0 \
osinfo-db"

inherit rpm
