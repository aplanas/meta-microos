SUMMARY = "Machines plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from machines file."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-machines-2.34-10.2.aarch64.rpm"
RPM_HASH = "d44dd9deaacc01c63531d27f809116a65516d393147d107edd0da0d0c5ba3104e56de47084317b1b8cd4431e3cd5e3ebd984c97c1f6eb46094e2c3181f38d4b4"

RPROVIDES:${PN} += "pdsh-machines \
pdsh-machines(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
pdsh"

inherit rpm
