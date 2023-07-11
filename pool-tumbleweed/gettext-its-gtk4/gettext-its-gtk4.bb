SUMMARY = "International Tag Set for GTK+ 4"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 4"
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gettext-its-gtk4-4.10.4-1.2.aarch64.rpm"
RPM_HASH = "521687988c278ad154e913fe7eb104cad9418c5a937c03db371a10878334f94ba8218b1262c9753614643772b550aa0086b0c3fa088eff8e6539bab012f379f6"

RPROVIDES:${PN} += "gettext-its-gtk3 \
gettext-its-gtk4"

RDEPENDS:${PN} += ""

inherit rpm
