SUMMARY = "Development files to build modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains the development headers for developing modules for \
dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-devel-2.11-1.16.aarch64.rpm"
RPM_HASH = "7fa8cd1e738c7dc01f608e7f239519715e17bd9945a76022c7ec333a9d3495c448799794e2077f18d28ff7dd6ccb258691eae9373bca03e31d81a3c8793bd33b"

RPROVIDES:${PN} += "dico-devel"

RDEPENDS:${PN} += "libdico2"

inherit rpm
