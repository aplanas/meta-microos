SUMMARY = "Additional data for the qalculator calulator library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This provides definitions of additional units, functions, etc. on top \
of the built-in ones."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-data-4.6.1-1.2.noarch.rpm"
RPM_HASH = "27191df2b39d6b71522a1a841ce53947db8784cfb0869eed0abc72ab2b693a8ad167ac5f2b97b577190ca75b69ec6d23bc1b31d0c23043e0f3d016066e9f78c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qalculate-data \
qalculate:/usr/share/qalculate/units.xml"

RDEPENDS:${PN} += "libqalculate"

inherit rpm
