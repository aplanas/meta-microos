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

RPM_NAME = "libxmltooling-lite10-3.2.4-1.1.aarch64.rpm"
RPM_HASH = "fd3134d17d77b495978cc096fbc8e6740f253b498ad3462e6c58a3434b0a77cee689dfa7323f65cdd2217a4e99c9a434c7afcf3ccae9b12134f3aa88e0d34f5f"

RPROVIDES:${PN} += "libxmltooling-lite.so.10 \
libxmltooling-lite10 \
xmltooling"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libz.so.1"

inherit rpm
