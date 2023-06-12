SUMMARY = "Static linked version of Busybox, a compact UNIX utility collection"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-static-1.36.0-1.3.aarch64.rpm"
RPM_HASH = "f7ac65342b0714fa8474ba5c88bcf25debb6f38d6509b2cc9bc0726b86de5c039071a7ef177f48a95361424aa729b3835f43d970117f4181795783bcaf6215c4"

RPROVIDES:${PN} += "busybox-static \
busybox-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
