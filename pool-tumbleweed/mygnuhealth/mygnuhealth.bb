SUMMARY = "The personal health record for the GNU Health system"
DESCRIPTION = "The Personal Health Information Management System for Desktop and Mobile Devices \
for the GNU Health ecosystem"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "mygnuhealth-1.0.5-2.7.aarch64.rpm"
RPM_HASH = "88c90b2289f003e3274f2605006a73827439855a71b972d82393ce241be0bba15ce1879d1f3e34826e551e42edde912604bf95265a5c68bd3772e5dcde455c9b"

RPROVIDES:${PN} += "mygnuhealth \
python3.11dist-mygnuhealth \
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
