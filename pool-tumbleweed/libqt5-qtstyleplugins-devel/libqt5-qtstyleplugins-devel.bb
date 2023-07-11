SUMMARY = "Qt 5 Style Plugins Development Files"
DESCRIPTION = "You need this package, if you want to compile programs with qtstyleplugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-devel-5.0.0+git20170311-10.12.aarch64.rpm"
RPM_HASH = "5df2cf7b452a83466a83387e8f6fa450f50be0c84e48e0016364aa7079df69b32fda403a46935e3147c39871979acb0075d3d30458635bf72c4d2c3a095a19c2"

RPROVIDES:${PN} += "libqt5-qtstyleplugins-devel"

RDEPENDS:${PN} += "libqt5-qtstyleplugins \
libqt5-qtstyleplugins-platformtheme-gtk2"

inherit rpm
