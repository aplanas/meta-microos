SUMMARY = "Tools for the G3 (Fax) Graphics Format"
DESCRIPTION = "These utilities convert graphics files from the G3 format into the \
general- purpose PBM format and back, so you can print or manipulate \
them. G3 is used by fax modems and machines. \
 \
The g3utils are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "g3utils-1.2.1-9.3.aarch64.rpm"
RPM_HASH = "0a72185f418e10f14b11d965a0ded7cfc6beacf19156ad882841d853e64e0d9433a77bd9997e66e4e374ca7c21c6744dae7e261dc514f68acb98ddb993f72c50"

RPROVIDES:${PN} += "g3utils \
g3utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
