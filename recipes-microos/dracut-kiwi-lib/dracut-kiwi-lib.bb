SUMMARY = "KIWI - Dracut kiwi Library"
DESCRIPTION = "This package contains a collection of methods to provide a library \
for tasks done in other kiwi dracut modules"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "dracut-kiwi-lib-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "2a69a826a78860e739f0ec7336cb4009e22b41a4ad91fe22ad69d265d911263371bd843a8031bef62231c35611323d97e5c8d53ff7ee0543bc517fda692eca1c"

RPROVIDES:${PN} += "dracut-kiwi-lib dracut-kiwi-lib(aarch-64)"
RDEPENDS:${PN} += "/bin/bash bc btrfsprogs coreutils cryptsetup curl device-mapper dialog e2fsprogs gptfdisk grep lvm2 mdadm parted pv util-linux util-linux-systemd xfsprogs xz"

inherit rpm
