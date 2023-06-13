SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-iproute2-1.36.0-26.3.noarch.rpm"
RPM_HASH = "502ef953bb9dda0e73747fec9e7c89bd6b92ba45c8ddfb4b5ddcaa703e3e6f94f585afad1f03d36322f0069e9af58e3f9664c1263bdc682607017cc153b7dd39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
