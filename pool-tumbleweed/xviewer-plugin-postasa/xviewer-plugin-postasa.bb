SUMMARY = "Xviewer postasa plugin"
DESCRIPTION = "xviewer postasa plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-postasa-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "904321342c77078665357adcb50eebcba88af828d12554622feebc7dac1604e6ca6473f389c7c0e1d10514b7f1bd0c6ab141ae6c309afff8fc7f5ae8024c79cd"

RPROVIDES:${PN} += "libpostasa.so \
xviewer-plugin-postasa \
xviewer-plugins-/usr/lib64/xviewer/plugins/postasa.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdata.so.22 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
