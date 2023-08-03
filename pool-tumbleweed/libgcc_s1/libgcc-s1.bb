SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libgcc_s1-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "adeb77a93b2286993c805cc2ae5141a763f08c425b4e3232cbd8da9f751b23715deb2e0c46dae94ec0ab8ed61771552854de238cfd743da0c28b89df95524de1"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
