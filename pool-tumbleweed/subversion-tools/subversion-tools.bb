SUMMARY = "Tools for Subversion"
DESCRIPTION = "This package contains some tools for subversion server and \
repository admins."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-tools-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "cdd05eac312d94694855ee6f2c2d86c98eec558e239dfb78196a7c81b47645ead9fb3fcf58e16df7e93968565c1ee1e6cf537035fda3ba3324eb2671ae267713"

RPROVIDES:${PN} += "subversion-tools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0"

inherit rpm
