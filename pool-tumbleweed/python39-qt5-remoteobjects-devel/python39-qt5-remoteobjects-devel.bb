SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-remoteobjects-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "6b97a3a60e58685bbf1789e5f2c5a2debd3339187a616d0f6dd25c094d4f5dd008cc2e5d3aebdf7500bcc35bf2f6a6b4f28e6e6f462d4fd760f9efe4ef338ac5"

RPROVIDES:${PN} += "python39-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python39-qt5-devel"

inherit rpm
