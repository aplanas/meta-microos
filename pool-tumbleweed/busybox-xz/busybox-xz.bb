SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-xz-1.36.1-30.1.noarch.rpm"
RPM_HASH = "ef65ba995c403119bad80e9dc32dcd9698cb52bf40111b9798d8bcd2808e634345282349e20474da5cff73a3c847c1fd77a1578748bed709264af3d0401ae3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"

RDEPENDS:${PN} += "busybox"

inherit rpm
