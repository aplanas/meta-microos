SUMMARY = "Python framework for Desktop applications"
DESCRIPTION = "A Python framework for building Desktop applications."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "uranium-4.13.1-2.3.noarch.rpm"
RPM_HASH = "85b15f3a03a64050fc81d69476682a8afdec3363adb792a08a8c490db31fb3558d1c5bc5a3c73a1c6fa4ca54c3bdd4ad41780ab06adf5f964c5829442e34d556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt5qmlimport-UM.1 \
uranium"

RDEPENDS:${PN} += "python-abi \
python3.10dist-arcus \
python3.10dist-cryptography \
python3.10dist-shapely \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-UM.1"

inherit rpm
