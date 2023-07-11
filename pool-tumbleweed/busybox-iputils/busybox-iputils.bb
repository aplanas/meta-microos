SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iputils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "47168648ec712958c43275bc7d2d8f3a7799b99aa1ce03666c6d6d16fa53f95506050eaac49ae31f71908e614718afadd9d816eeab6906ce2665333d20414eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ping \
busybox-iputils"

RDEPENDS:${PN} += "busybox"

inherit rpm
