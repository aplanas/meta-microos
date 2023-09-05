SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-time-1.36.1-29.1.noarch.rpm"
RPM_HASH = "78483bea97adadaad2cbb57a49446e1cb657fd8bafe22038eb75258995f62fdd4bcbb0b935ffdecc1896141a7762fcc0f8d1d3c64d78ccc65677cfaf739cb09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
