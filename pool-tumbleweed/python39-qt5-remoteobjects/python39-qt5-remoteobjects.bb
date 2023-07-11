SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-remoteobjects-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "5e8d2acbaf513770e76f698df553493733148c3114c3d576a29ba25a92df11c47cf121a29eafe3093b859d32edae8899cd9b14b23b3d766770839efcd4ea299d"

RPROVIDES:${PN} += "python39-qt5-remoteobjects"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-qt5"

inherit rpm
