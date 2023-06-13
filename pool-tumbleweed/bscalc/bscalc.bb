SUMMARY = "A utility for working with sizes in bytes"
DESCRIPTION = "The LibBytesize is a C library that facilitates work with sizes in \
bytes, be it parsing the input from users or producing a human-readable \
representation of a size in bytes. This library takes localization into \
account. It also provides support for sizes bigger than MAXUINT64."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "bscalc-2.8-1.1.noarch.rpm"
RPM_HASH = "64ff16f040e041d040ce447f21d1e922bad05749497c3fd4aff24d3daaa81a9efd22a05ed6f586625033e85482b3fb8da55c4e06114cce98d216502f7db2f6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bscalc"

RDEPENDS:${PN} += "/usr/bin/python3 \
libbytesize1"

inherit rpm
