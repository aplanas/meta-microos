SUMMARY = "Kurdi (Kurdî, كوردی‎) Dictionary for Aspell"
DESCRIPTION = "A Kurdi (Kurdî, كوردی‎) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "aspell-ku-0.20.1-2.14.aarch64.rpm"
RPM_HASH = "4b7406371e54fc0f17ccbfe6f90cae42548603d257148d85a5098b6e8026c267a9eb85507a0c372dcd5457ada3cfe7f672f5fe98e6a67434c991a9adb576cf30"

RPROVIDES:${PN} += "aspell-ku \
aspell-ku(aarch-64) \
locale(aspell:ku)"
RDEPENDS:${PN} += ""

inherit rpm
