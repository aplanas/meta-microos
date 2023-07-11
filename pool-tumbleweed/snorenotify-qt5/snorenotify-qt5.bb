SUMMARY = "Snorenotify is a multi platform Qt based notification framework"
DESCRIPTION = "Snorenotify is a multi platform Qt based notification framework. Using a plugin system it is possible to create notifications with many different notification systems on Windows, Unix and Mac."
LICENSE = "LGPL-3.0"

PV = "0.7.0"

RPM_NAME = "snorenotify-qt5-0.7.0-2.35.aarch64.rpm"
RPM_HASH = "c21302293a1bd9ba0653dd463284c53bdd652ec2528afdaec16203131f32bbc37e55a19f1861af3086b24c53db008b1ed2ae457f5f6ed614103a96114b100aea"

RPROVIDES:${PN} += "libsnore-backend-freedesktop.so \
libsnore-backend-snore.so \
libsnore-backend-trayicon.so \
libsnore-frontend-freedesktop.so \
libsnore-frontend-pushover.so \
libsnore-frontend-snarlnetwork.so \
libsnore-qt5.so.0.7 \
libsnore-secondarybackend-nma.so \
libsnore-secondarybackend-puhover.so \
libsnore-secondarybackend-sound.so \
libsnore-secondarybackend-toasty.so \
libsnore-settings-backend-snore.so \
libsnore-settings-frontend-pushover.so \
libsnore-settings-secondarybackend-nma.so \
libsnore-settings-secondarybackend-puhover.so \
libsnore-settings-secondarybackend-sound.so \
libsnore-settings-secondarybackend-toasty.so \
libsnoresettings-qt5.so.0.7 \
snorenotify-qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
