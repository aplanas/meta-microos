SUMMARY = "Qt Wrapper around TpLogger client library"
DESCRIPTION = "Telepathy-logger-qt5 is a Qt Wrapper around the TpLogger client library. \
It is needed by KDE Telepathy in order to log the chat activity."
LICENSE = "LGPL-2.1-or-later"

PV = "17.09.0"

RPM_NAME = "telepathy-logger-qt5-devel-17.09.0-1.17.aarch64.rpm"
RPM_HASH = "f6e1e3f7a5346c9ad9dea217a7dfb078e102447d095e2c5b85497486d63e23355147a3a8af9f56e0b6bdf43c6471189313d6d139116e7b8300a6412266f911a1"

RPROVIDES:${PN} += "cmake-TelepathyLoggerQt \
telepathy-logger-qt5-devel"

RDEPENDS:${PN} += "libtelepathy-logger-qt5 \
telepathy-glib-devel \
telepathy-logger-devel"

inherit rpm
