SUMMARY = "Non-ABI stable experimental API for the Qt5 GUI library"
DESCRIPTION = "This package provides private headers of libQt5Gui that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Gui-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "70c3b81651d7c5ae363ba95e851d456183b0e1ed3775817b912e5ce9f564408e1b2ded10ec296ccf61fc05433ea1baa017384b269c08dfde55a3022b94d10911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Gui-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-devel"

inherit rpm
