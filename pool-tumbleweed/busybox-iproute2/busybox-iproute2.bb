SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iproute2-1.36.1-27.1.noarch.rpm"
RPM_HASH = "875247667ea7e514773dbed69f7edacf4da6e71dfd163122d8fbdfa52142d23844ba87a86532fe02e1f8a35c2a03f011f0915424b3300559acdc37ccd384a087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
