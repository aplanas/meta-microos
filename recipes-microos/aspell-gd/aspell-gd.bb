SUMMARY = "Scottish (Gàidhlig) Gaelic Dictionary for Aspell"
DESCRIPTION = "A Scottish (Gàidhlig) Gaelic dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1.1.1"

RPM_NAME = "aspell-gd-0.7.1.1.1-2.14.aarch64.rpm"
RPM_HASH = "68967bb8da375cc669e1db7330fe403e43b71a3a17a37df660b47250e1455ac3f49cfd11e5263296bf301942a1dedca879006b87d9696a40774adb4a4c9183f3"

RPROVIDES:${PN} += "aspell-gd aspell-gd(aarch-64) locale(aspell:gd)"
RDEPENDS:${PN} += ""

inherit rpm
