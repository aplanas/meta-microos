SUMMARY = "Machines plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from machines file."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-machines-2.34-12.1.aarch64.rpm"
RPM_HASH = "0a4758a4752a9dadf043af29992d3e5ba878f0272600a3f68ce598ae16d687fadfe85414047df4b205646991a6481067c6c7de89703ec0e911bbd9666aa20787"

RPROVIDES:${PN} += "pdsh-machines"

RDEPENDS:${PN} += "libc.so.6 \
pdsh"

inherit rpm
