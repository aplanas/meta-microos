SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kmod-1.36.1-28.1.noarch.rpm"
RPM_HASH = "9d85f67327d9f69014980e15969588c60e0e591d2c9099c23904e5d6bfee296d1d744ace64064f1c7d6bf6a6cb9c401af9a9ec790a589c1bedfe2ba8fe9865a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
