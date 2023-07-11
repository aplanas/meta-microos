SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-dos2unix-1.36.1-27.1.noarch.rpm"
RPM_HASH = "b184a601ce7df0592023b89c8988b416e8ef25ae21e024000239dd2c1cba3dc360f79ec338eb8e60a12153b74010baaa9cac7ab1f6ee17078896f5eb1a33e0de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
