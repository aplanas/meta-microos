SUMMARY = "Qt5 Script examples"
DESCRIPTION = "Examples for libqt5-qtscript module."
LICENSE = "BSD-3-Clause"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-examples-5.15.12-2.3.aarch64.rpm"
RPM_HASH = "0eeab16da9b59ccce1879d1d732d83e783160cb1a8868e217b0962659cfaaa042450110012162b7ccdca3c23eabd4f71370694d0f516599907932dfac4bdeda3"

RPROVIDES:${PN} += "libqt5-qtscript-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
