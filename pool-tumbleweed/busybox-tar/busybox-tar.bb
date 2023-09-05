SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tar-1.36.1-29.1.noarch.rpm"
RPM_HASH = "4303f9c2a4b02671be359241fe2d2c70d65bbef43603dfd9bcbb04a7adb1bcf272f2bc82ca0c38d684dc97987c8d0beb169eb2d32134fb55129f6fd3fda6339e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/tar \
busybox-tar"

RDEPENDS:${PN} += "busybox"

inherit rpm
