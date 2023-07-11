SUMMARY = "A utility for working with sizes in bytes"
DESCRIPTION = "The LibBytesize is a C library that facilitates work with sizes in \
bytes, be it parsing the input from users or producing a human-readable \
representation of a size in bytes. This library takes localization into \
account. It also provides support for sizes bigger than MAXUINT64."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "bscalc-2.8-1.2.noarch.rpm"
RPM_HASH = "16a3de07f137ac27a1bd8cce7bd63ff7c27560fc63f032e9116b9908fb49bba87400630bb2a958c0ee9f528c56b34c0b511009303799032b65fe39e9cda6e439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bscalc"

RDEPENDS:${PN} += "/usr/bin/python3 \
libbytesize1"

inherit rpm
