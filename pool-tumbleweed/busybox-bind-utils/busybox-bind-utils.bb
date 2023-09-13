SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bind-utils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "863b3be88fff2499529e51050cd010020cf55f68b74cc0ad1533adfb0fa7725b5cc8835582a768d912645c793d7a309fa6c16cb896337f2f6f70718e903268bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
