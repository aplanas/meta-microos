SUMMARY = "Static linked version of Busybox, a compact UNIX utility collection"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-static-1.36.1-1.1.aarch64.rpm"
RPM_HASH = "bca40bfba9f8f76910e0ff6a560638bad673a0ae758ccbca3da2db8161de00398aa0c6dc993ea052689ab84c24b67d67e8e18c37b5d66f92f3ba8d1455631c46"

RPROVIDES:${PN} += "busybox-static"

RDEPENDS:${PN} += ""

inherit rpm
