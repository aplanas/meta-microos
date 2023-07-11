SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-remoteobjects-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "79195a818964fdc1cd78d247c2473be1bb33633e514765a61e0728023ce232ec62c714d2c453d2d3e35b45e1f03c9369a9b06c0b149a5027610d6bc9ba6f3aad"

RPROVIDES:${PN} += "python310-qt5-remoteobjects"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5"

inherit rpm
