SUMMARY = "A command line interface tasks manager"
DESCRIPTION = "TuDu is a command line interface to manage hierchical todos. \
Each task has a title and description, a deadline and scheduled date as well \
as categories and priorities."
LICENSE = "GPL-3.0-only"

PV = "0.10.4"

RPM_NAME = "tudu-0.10.4-1.11.aarch64.rpm"
RPM_HASH = "aeccc31938feb20c618f30acf6a77948091f1227d73af28ff3018adbc0f51494d005b41e49a4d3cac70d2b5464f495d3678c0eb62e30116d785d19d407065260"

RPROVIDES:${PN} += "config(tudu) \
tudu \
tudu(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
