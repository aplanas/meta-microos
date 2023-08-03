SUMMARY = "Additional data for the qalculator calulator library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This provides definitions of additional units, functions, etc. on top \
of the built-in ones."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "qalculate-data-4.7.0-1.1.noarch.rpm"
RPM_HASH = "8bae62eeb4152da08a445029f132a3ae26324d9426f875902b77801ff20245a7907190eb38b161728f3aa3cf1f9b47a876a9616f73fc446189f7119c86631146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qalculate-/usr/share/qalculate/units.xml \
qalculate-data"

RDEPENDS:${PN} += "libqalculate"

inherit rpm
