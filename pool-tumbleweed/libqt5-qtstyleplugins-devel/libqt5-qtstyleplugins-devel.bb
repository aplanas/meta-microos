SUMMARY = "Qt 5 Style Plugins Development Files"
DESCRIPTION = "You need this package, if you want to compile programs with qtstyleplugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-devel-5.0.0+git20170311-10.11.aarch64.rpm"
RPM_HASH = "e4fa077e7f575410b5afbf49b2b7b512a4e8472f4fa3af866a27f813105bc2ff49443da28453799241385de37b968419ac5ac6f502fea1f71578b03b3f00692a"

RPROVIDES:${PN} += "libqt5-qtstyleplugins-devel \
libqt5-qtstyleplugins-devel(aarch-64)"
RDEPENDS:${PN} += "libqt5-qtstyleplugins \
libqt5-qtstyleplugins-platformtheme-gtk2"

inherit rpm
