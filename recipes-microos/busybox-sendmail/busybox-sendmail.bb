SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sendmail-1.36.0-26.3.noarch.rpm"
RPM_HASH = "b4bf3d98bba897f9bec3df5ab55a014c38054b304211e962b7a067e18219dd9ee982e94acadca2671c4fe9c4e9c4deca40daf9e36d722ee952bf726691b0e1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp_daemon"
RDEPENDS:${PN} += "busybox"

inherit rpm
