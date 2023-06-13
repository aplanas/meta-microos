SUMMARY = "Document package for FUSE (userspace filesystem)"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-doc-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "f68a6e78bb32448318d2511187da98bd9cb16102dd061f11937ae71684d8357f488c5476baec596569cc81997dfb5c5b4706893904afcb10aeeba61c0d5b6e0a"

RPROVIDES:${PN} += "fuse-doc \
fuse-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
