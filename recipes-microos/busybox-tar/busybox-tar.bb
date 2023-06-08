SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-tar-1.36.0-26.3.noarch.rpm"
RPM_HASH = "ff62379866b7ef9b31ee87796fa1cc2e148c4a5476c1068e89bb9491087de8222ac3b20d0fd1cfd186f8df2bfc3104d2e813b1d5aa2cb02f926f294e710637a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/tar busybox-tar"
RDEPENDS:${PN} += "busybox"

inherit rpm
