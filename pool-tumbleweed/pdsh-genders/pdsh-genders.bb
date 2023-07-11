SUMMARY = "Genders plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by genders attributes."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-genders-2.34-12.1.aarch64.rpm"
RPM_HASH = "838d9a7806e02f2a29aebbf01bc3870cae152d05b260d3ca4cf124c1a4fa058efa8eb4977f18c9e1de8affbdcad6a33050cb7f2bd321421728ca9b5c7ddbc7f7"

RPROVIDES:${PN} += "pdsh-genders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
pdsh"

inherit rpm
