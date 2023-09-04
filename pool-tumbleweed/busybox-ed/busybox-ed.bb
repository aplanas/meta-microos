SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ed-1.36.1-28.1.noarch.rpm"
RPM_HASH = "6c8f3915df09c351660f16736fae93c6ef15937fe59fed9321cef0e9c01462c958ee5388acdeaa26c614b8a4ae5bede722e2d52dd8ef447df7893a00e6d16788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"

RDEPENDS:${PN} += "busybox"

inherit rpm
