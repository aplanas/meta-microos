SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-xz-1.36.1-27.1.noarch.rpm"
RPM_HASH = "d783866d46967460f0c22badf538d7bad1b31e2a76055f26896d212080cf757cdb700b9da6960a16d28ba20daaca17b9276d299082fc9a2dec5f7ef74effd59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"

RDEPENDS:${PN} += "busybox"

inherit rpm
