SUMMARY = "Snorenotify is a multi platform Qt based notification framework"
DESCRIPTION = "Snorenotify is a multi platform Qt based notification framework. Using a plugin system it is possible to create notifications with many different notification systems on Windows, Unix and Mac."
LICENSE = "LGPL-3.0"

PV = "0.7.0"

RPM_NAME = "snorenotify-qt5-devel-0.7.0-2.35.aarch64.rpm"
RPM_HASH = "2b71555b8ab590dd9aff5524bff93473fb4847addea8ec1ba56ce90cc883b96ff663b6439226b49fc672bbf793028bf6f3f79775469e9080693b54f58673c94a"

RPROVIDES:${PN} += "cmake-LibsnoreQt5 \
cmake-LibsnoreSettingsQt5 \
snorenotify-qt5-devel"

RDEPENDS:${PN} += "snorenotify-qt5"

inherit rpm
