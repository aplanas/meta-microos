SUMMARY = "Qt5 virtualkeyboard examples"
DESCRIPTION = "Examples for libqt5-qtvirtualkeyboard module."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8301da5cb07f95253bf1b1b525070ecb15542de22b0dd95abfc2c1d830768dc71fe50c95eb78248976d8323a0210f98af92b334ad8dcf0131b088a1055ea33b2"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-examples \
libqt5-qtvirtualkeyboard-examples(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
