SUMMARY = "The personal health record for the GNU Health system"
DESCRIPTION = "The Personal Health Information Management System for Desktop and Mobile Devices \
for the GNU Health ecosystem"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "mygnuhealth-1.0.5-2.6.aarch64.rpm"
RPM_HASH = "a0eb3de69eb0ec53c224d097cfa27440ab76e645e279cb322f6a59618181eb19bbb38cc940ce72294d10cb3f6a0fbd187bcffa448f14201a4423ac3609efa7cf"

RPROVIDES:${PN} += "mygnuhealth \
python3.10dist-mygnuhealth \
python3dist-mygnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
kirigami2 \
python-abi \
python3-bcrypt \
python3-matplotlib \
python3-pyside2 \
python3-requests \
python3-tinydb \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
