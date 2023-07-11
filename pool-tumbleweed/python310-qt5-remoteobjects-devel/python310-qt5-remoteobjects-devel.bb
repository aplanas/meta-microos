SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-remoteobjects-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "aaea60032099748b42fa1f3b8d3c9630cc3fb62606ee79a3882e8e228dcfa1ab56924019da19fc3de3151ccf683f7ca616c06c81c61e7b1e14bcc06a9c8d902c"

RPROVIDES:${PN} += "python310-qt5-remoteobjects-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5RemoteObjects \
python-abi \
python310-qt5-devel"

inherit rpm
