SUMMARY = "Python framework for Desktop applications"
DESCRIPTION = "A Python framework for building Desktop applications."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "uranium-4.13.1-2.4.noarch.rpm"
RPM_HASH = "316da5fc8fe5ccf7d242d86a42d653e3ee4efeb0436039c9686347909bf1a7c0e19d165e7d3a5305f0ba228105ddc500c4f0540e501851a77f3779c7fff8fe2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt5qmlimport-UM.1 \
uranium"

RDEPENDS:${PN} += "python-abi \
python3.11dist-arcus \
python3.11dist-cryptography \
python3.11dist-shapely \
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
