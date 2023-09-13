SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iproute2-1.36.1-30.1.noarch.rpm"
RPM_HASH = "86ba3a750d44c5ee6230f24e0a163b2a1ea0d26c0071d7fd291d330c2f998c5014a939918a98afc1c7ad84a4020b12835d98cf5459f60384caab9be6cd332846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
