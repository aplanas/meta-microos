SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iproute2-1.36.1-29.1.noarch.rpm"
RPM_HASH = "e85da94f8211a30b58aadc9facf57ab4f86d15dc58f48b6d9e886df1a9d74c041e56b6ab248d4fe4104a5919727159de6b15eefd9d55812bef81efd4b6a36b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
