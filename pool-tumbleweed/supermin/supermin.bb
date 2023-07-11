SUMMARY = "Bootstrapping tool for creating supermin appliances"
DESCRIPTION = "supermin is a tool for building supermin appliances. These are tiny \
appliances (similar to virtual machines), usually around 100KB in size, \
which get fully instantiated on-the-fly in a fraction of a second when \
you need to boot one of them."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.2"

RPM_NAME = "supermin-5.2.2-4.4.aarch64.rpm"
RPM_HASH = "008e96a4def0452d1a4627a7992a458a6efbb7ae1c29ab7a65e3c8c76302f7bfde96eeaf77868988deefb912299a711eb4e8cdd2c6fd21183a31918b200102d6"

RPROVIDES:${PN} += "febootstrap \
supermin"

RDEPENDS:${PN} += "distribution-release \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
libm.so.6 \
librpm.so.9 \
librpmio.so.9 \
tar \
xmlstarlet \
zypper"

inherit rpm
