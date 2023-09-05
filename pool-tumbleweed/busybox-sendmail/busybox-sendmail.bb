SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sendmail-1.36.1-29.1.noarch.rpm"
RPM_HASH = "c6e334e9154c2ab0e01a018a830f410f0d2a6480a89d19e376a6d57687020107b9e5550a0e8312b0f552b4f40bd1d7ea76663cd405e71790efccf146632085d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp-daemon"

RDEPENDS:${PN} += "busybox"

inherit rpm
