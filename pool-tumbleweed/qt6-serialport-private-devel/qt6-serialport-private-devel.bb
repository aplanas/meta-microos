SUMMARY = "Non-ABI stable API for the Qt 6 SerialPort library"
DESCRIPTION = "This package provides private headers of libQt6SerialPort that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-serialport-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "56b48f9436102cbff88f1d2b4043e98b23a2ddeb78c596c60753dbd568b9b261576966149cc126591635ff65fb09c076e8b07f6cb88b3ddd569c30fa3785236a"

RPROVIDES:${PN} += "qt6-serialport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SerialPort \
qt6-core-private-devel"

inherit rpm
