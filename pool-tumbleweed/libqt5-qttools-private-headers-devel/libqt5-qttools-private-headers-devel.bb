SUMMARY = "Non-ABI stable experimental API for the Qt5 Tools library"
DESCRIPTION = "This package provides private headers of libqt5-qttools that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-private-headers-devel-5.15.9+kde1-1.1.noarch.rpm"
RPM_HASH = "6053001b326eef2a820e1e13b6680767b284058fdd7ffe404416f1330f45dd54476778ebc67abc38e6108b36ebcf14f6221305333c8f2f3fb9e88975f796b6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qttools-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qttools-devel"

inherit rpm
