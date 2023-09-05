SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bzip2-1.36.1-29.1.noarch.rpm"
RPM_HASH = "a89a0ab16da688c513a0f4d38892a92cae27b12efc48d974f322222d2eb733622845ff4a5dd5dd2736a4190c79bc574bd643bd6dfca5161862104290bc0920f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
