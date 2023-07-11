SUMMARY = "Modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains extensions and modules for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-modules-2.11-1.16.aarch64.rpm"
RPM_HASH = "f097464ab2e1d58dbe2085a974ec598735137e1b18d0c18408bd4016072005cb02bf7ae56fb91e589ea73f758b27915ecba71afb751c5eaa3d48dd0dc26c7ece"

RPROVIDES:${PN} += "dico-modules"

RDEPENDS:${PN} += "dico \
ld-linux-aarch64.so.1 \
libWN.so.3 \
libc.so.6 \
libdico.so.2 \
libguile-3.0.so.1 \
libldap.so.2 \
libpam.so.0 \
libpcre.so.1 \
libpython3.11.so.1.0 \
libz.so.1"

inherit rpm
