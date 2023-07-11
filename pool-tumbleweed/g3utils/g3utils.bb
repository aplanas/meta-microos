SUMMARY = "Tools for the G3 (Fax) Graphics Format"
DESCRIPTION = "These utilities convert graphics files from the G3 format into the \
general- purpose PBM format and back, so you can print or manipulate \
them. G3 is used by fax modems and machines. \
 \
The g3utils are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "g3utils-1.2.1-9.4.aarch64.rpm"
RPM_HASH = "b5518fa1354abecb3226bf2395d939be14a500e055eeed839e3eedef2df1af4a5a09d28384dc637fede5ab82102869e95a10d42eb9b29455db09deb59425cf43"

RPROVIDES:${PN} += "g3utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
