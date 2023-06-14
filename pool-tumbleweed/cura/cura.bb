SUMMARY = "3D printer control software"
DESCRIPTION = "Cura is a project which aims to be an single software solution for 3D printing. \
While it is developed to be used with the Ultimaker 3D printer, it can be used \
with other RepRap based designs. \
 \
Cura helps setting up an Ultimaker, shows the 3D model, allows for scaling / \
positioning, can slice the model to G-Code with editable configuration \
settings, and send this G-Code to the 3D printer for printing."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "cura-4.13.1-2.3.noarch.rpm"
RPM_HASH = "409d77c45d29f4a0d24cb5e36f7975bd34adb99a49bd996d4d7fc7389cd05a5f8b917b14c6618a6815cae02b0bde901bc3ffbdb2e1579259d3ec9e2cb9148d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cura"

RDEPENDS:${PN} += "/usr/bin/python3 \
cura-engine \
python-abi \
python3-Arcus \
python3-Savitar \
python3-keyring \
python3-numpy \
python3-pynest2d \
python3-pyserial \
python3-qt5 \
python3-requests \
python3-scipy \
python3-sentry-sdk \
python3-shapely \
python3-typing \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-UM.1 \
uranium"

inherit rpm
