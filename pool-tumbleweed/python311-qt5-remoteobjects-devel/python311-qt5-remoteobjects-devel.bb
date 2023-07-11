SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-remoteobjects-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "e980696e358dcead8a280f362987ed51a4f4c952508ae80fcd3b3ab5a9fb1180ee2d1c2435d8f52dbcb2ddc11e6f3264b47014794246f7cdf561ad92132ecd5f"

RPROVIDES:${PN} += "python3-qt5-remoteobjects-devel \
python311-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python311-qt5-devel"

inherit rpm
