SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kmod-1.36.1-27.1.noarch.rpm"
RPM_HASH = "d949341d7bff8cdeec357233da4616f1e70e501c9d7c5c793f2e89cbb5aba3ee847ea412dd7c2e290a6554f9270c8a478d174286beb07aeeb76b4e3ee9ce8c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
