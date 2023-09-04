SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gawk-1.36.1-28.1.noarch.rpm"
RPM_HASH = "78ee9b7d8b98d52df2cc5b28173b949970d43edfa3a503f5f36fe772d96258e8d5ade19ff61fa58e1a8e53685f0784ac242c2dca599198d8c4a9bf9598082ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/awk \
busybox-gawk"

RDEPENDS:${PN} += "busybox"

inherit rpm
