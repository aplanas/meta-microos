SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sendmail-1.36.1-27.1.noarch.rpm"
RPM_HASH = "9fc68b42e4fd9a6fc48ace4b0ca6e6f4404f5edec9603b9a6f45d81022025e706d7e24b10c22f476b2ac9f2a95a249e2b45e6eccb599cb97a2741df089895944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp-daemon"

RDEPENDS:${PN} += "busybox"

inherit rpm
