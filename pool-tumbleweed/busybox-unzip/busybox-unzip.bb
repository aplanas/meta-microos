SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-unzip-1.36.0-26.3.noarch.rpm"
RPM_HASH = "eed06efce7f154c6668dd15035bfff89137e0e82da85f3608aa4b141419e8fc1d1e0c7676ff82e1a05b4d961d1adae6f8bc9477614f32542d6a6440e02d68f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"
RDEPENDS:${PN} += "busybox"

inherit rpm
