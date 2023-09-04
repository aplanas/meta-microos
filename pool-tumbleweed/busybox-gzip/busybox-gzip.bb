SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gzip-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d8df53120681aea3f4a5971caa8017dd764b4cd562cf6f7b0207153bea47294eea0b4d53381d6aed916d77ffcd5f22f82f8d16548f34822657cd7fd11f388332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
