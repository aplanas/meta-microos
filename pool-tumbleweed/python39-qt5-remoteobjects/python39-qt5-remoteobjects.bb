SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-remoteobjects-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "d035236b79bb9131e1be9a30c7772d2b5a687430c3a583dde0839bee6ea5fbd9308ea17ef4dca9fe429110a1880fb5065cd61d2801438e9007be22913c8641fa"

RPROVIDES:${PN} += "python39-qt5-remoteobjects \
python39-qt5-remoteobjects(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5RemoteObjects.so.5()(64bit) \
libQt5RemoteObjects.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python39-qt5"

inherit rpm
