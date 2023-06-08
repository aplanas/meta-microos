SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-wget-1.36.0-26.3.noarch.rpm"
RPM_HASH = "f036abf69f90c1b57858c89323df789f12bca15d57a8e3345afa6e20a296ffd4918aae1bd349fbdcdc3af4b36e1e38f14a0e529ef267d11d320b1a9dafc7117f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"
RDEPENDS:${PN} += "busybox"

inherit rpm
