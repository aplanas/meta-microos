SUMMARY = "Intel OSPM plugin for connman"
DESCRIPTION = "Provides Intel OSPM support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-iospm-1.41-4.7.aarch64.rpm"
RPM_HASH = "c349a023aa585a28a6e2a18b2a576bdf586937f1f8bcddb83a8018acd85f4ac8183831f009c39aa7f11a2dfafcf474681bb32a6f354f65b3f2ce76bc98a7de4c"

RPROVIDES:${PN} += "connman-plugin-iospm connman-plugin-iospm(aarch-64)"
RDEPENDS:${PN} += "connman ppp"

inherit rpm
