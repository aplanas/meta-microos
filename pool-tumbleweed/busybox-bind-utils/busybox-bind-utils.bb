SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bind-utils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "a36fb2332df3307f5e00f6dd90a67ddcf992f40a62398dbdef4c95f543fbdef41aee13e0cd24e82c94b04913a7bbe57265de255daab4a734e283ee10aa204aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
