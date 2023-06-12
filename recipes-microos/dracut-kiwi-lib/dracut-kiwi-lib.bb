SUMMARY = "KIWI - Dracut kiwi Library"
DESCRIPTION = "This package contains a collection of methods to provide a library \
for tasks done in other kiwi dracut modules"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-lib-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "86b561cd506a8716468c38f425192676d276ab173e6d53eb7cefd58962c806eaafed658996d73ba0cf00fb5b12a8344dd58fa08cfa8f21b70b3c0390d86bf1b3"

RPROVIDES:${PN} += "dracut-kiwi-lib dracut-kiwi-lib(aarch-64)"
RDEPENDS:${PN} += "/bin/bash bc btrfsprogs coreutils cryptsetup curl device-mapper dialog e2fsprogs gptfdisk grep lvm2 mdadm pv util-linux util-linux-systemd xfsprogs xz"

inherit rpm
