SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-remoteobjects-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "1d4e1d6fba507f5dda53234a3802b52d64c2dbae791a0085c82e3dc46789d5c790d8dd77ab626e967d61c8f807d3168ed30f76e9b44e2828abd64bdccf3a1bdb"

RPROVIDES:${PN} += "python3-qt5-remoteobjects \
python311-qt5-remoteobjects"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5"

inherit rpm
