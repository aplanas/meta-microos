SUMMARY = "Utilities for working with libt3highlight"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains the T3 highlighting utility."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-utils-0.5.0-1.15.aarch64.rpm"
RPM_HASH = "5d6e5188c555a935c3348d8259a4dfd7d842bea92fdb43b261ff97f244d10c23c6f5ee86e100abe07624a4880f609989f9ff205414d497e5677325508fecb8c2"

RPROVIDES:${PN} += "libt3highlight-utils \
libt3highlight-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libt3config.so.0()(64bit) \
libt3highlight.so.2()(64bit)"

inherit rpm
