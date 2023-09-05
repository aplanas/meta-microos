SUMMARY = "Additional data for the qalculator calulator library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This provides definitions of additional units, functions, etc. on top \
of the built-in ones."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "qalculate-data-4.8.0-1.1.noarch.rpm"
RPM_HASH = "2463110d9d7328dbf4d18451d28ec8d62ef7bfc285bdb6cfeae8701ab1e76d6de8df8aa81a41e10b7c18f27fa578e613e43accdad93cb229b5d930099d88f22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qalculate-/usr/share/qalculate/units.xml \
qalculate-data"

RDEPENDS:${PN} += "libqalculate"

inherit rpm
