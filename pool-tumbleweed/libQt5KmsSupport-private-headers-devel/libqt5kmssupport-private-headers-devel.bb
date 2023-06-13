SUMMARY = "Non-ABI stable experimental API for the Qt5 KMS support library"
DESCRIPTION = "This package provides private headers of libQt5KmsSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5KmsSupport-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "71d52e76380a9a9254e60f8015969df6322635f4cf0aa2ae7e8ea84cd97bbac520b64b11eb1db3a073a8790c9ffdafa4c37b33f86b15af7a021e564d55d91c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5KmsSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-devel-static"

inherit rpm
