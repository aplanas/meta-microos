SUMMARY = "Non-ABI stable experimental API for the Qt5 core library"
DESCRIPTION = "This package provides private headers of libQt5Core that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Core-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "a59fc70ff7ad3aa81866a448dc70ed335d1ad8888adb4ee40236010a72e972204705340ca048174ee71f34336d713da1abb9e80d88ffa671acb6f8f5b298cf0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Core-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-devel"

inherit rpm
