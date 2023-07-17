SUMMARY = "Non-ABI stable experimental API for the Qt5 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt5DBus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "dc2760002dcf3199ebcd138124b7576e6e0167fe5fbc9362def18bb32a288c7861558415485dcff4a5909be6cbcac772113965ad1ed17e60b9b8148ef0f21b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5DBus-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-devel"

inherit rpm
