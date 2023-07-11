SUMMARY = "OpenSAML XMLTooling library"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxmltooling10-3.2.4-1.1.aarch64.rpm"
RPM_HASH = "eefdf20f5209383a229e6965eb48be05d5e8746c8cf02d3e47db2e53536b4851c870bc7aa088b46e7e7e6a04f9c4edb830b360779f91c10a6a5bd3f0d6a2ce66"

RPROVIDES:${PN} += "libxmltooling.so.10 \
libxmltooling10 \
xmltooling"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libssl.so.3 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxml-security-c.so.20 \
libz.so.1"

inherit rpm
