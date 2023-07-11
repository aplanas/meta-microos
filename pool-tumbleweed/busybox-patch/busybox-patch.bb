SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-patch-1.36.1-27.1.noarch.rpm"
RPM_HASH = "2a595fbab2fd49f2561d073c365443a35670ab5ce5a7ad1a213449627e468ff71982cd92e8e59bcd79e9dc03989c5acbda3d9a34d52e9ddb78e5c7c9df0d2457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"

RDEPENDS:${PN} += "busybox"

inherit rpm
