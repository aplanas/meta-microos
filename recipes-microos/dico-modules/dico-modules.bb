SUMMARY = "Modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains extensions and modules for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "dico-modules-2.11-1.15.aarch64.rpm"
RPM_HASH = "dae6ac5098e8f8141fdd76fc198550e7806b3d3793ab5b1505e2a214d2ae7e76be5c4c062c1fdf2097a46c7b40d1f68f8dd91be887d21ce07b455be8791af14f"

RPROVIDES:${PN} += "dico-modules dico-modules(aarch-64)"
RDEPENDS:${PN} += "dico ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libWN.so.3()(64bit) libc.so.6(GLIBC_2.33)(64bit) libdico.so.2()(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpcre.so.1()(64bit) libpython3.10.so.1.0()(64bit) libz.so.1()(64bit)"

inherit rpm
