SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-which-1.36.1-29.1.noarch.rpm"
RPM_HASH = "f210a8ba328d61769eb5cd404198d1835e3038743d0e96f09504031a5b9b38c7f8866b50d68da3c6404b4b0a7052441d3beee919201163811b1ab251e151baa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"

RDEPENDS:${PN} += "busybox"

inherit rpm
