SUMMARY = "Development files to build modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains the development headers for developing modules for \
dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-devel-2.11-1.15.aarch64.rpm"
RPM_HASH = "fe7a4fd4d8cdedece57039567224de2e9b1c84fe805cad3136e91b3036b9272ab786c9ed0038ea7da14612966019f8c48ff009275d49db4ac173fbd4bb583197"

RPROVIDES:${PN} += "dico-devel \
dico-devel(aarch-64)"
RDEPENDS:${PN} += "libdico2"

inherit rpm
