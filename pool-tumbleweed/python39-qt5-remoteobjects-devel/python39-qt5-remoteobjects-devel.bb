SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-remoteobjects-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "701bbb9eab888ed94f0499237a49a0fc4517167d98d37b2cee429116396fa264fcd78d1c96a0a1277ef7e81a5c6cda8611ed22894c98b634560579d48db660ce"

RPROVIDES:${PN} += "python39-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python39-qt5-devel"

inherit rpm
