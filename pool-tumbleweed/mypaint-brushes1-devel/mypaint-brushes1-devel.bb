SUMMARY = "Files for developing with mypaint-brushes"
DESCRIPTION = "This package contains a pkgconfig file which makes it easier to develop \
programs using these brush files."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "mypaint-brushes1-devel-1.3.1-1.9.noarch.rpm"
RPM_HASH = "dc2bae97da185652c3892eb216419d22dc344611aad44ac1c3ac0d1c5387bcd374b20b70213753c76c2874267d247fe4eeac69c8deae95b1afdc5912e3cf5ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes-devel \
mypaint-brushes1-devel \
pkgconfig-mypaint-brushes-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mypaint-brushes1"

inherit rpm
