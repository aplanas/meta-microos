SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libaugeas0-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "a972bebc89ba8b29e6629483a1f5ed64e2367dff1afe17adc36dc67e2e72e08906e91a33bcb3a963a114033a39c104ad3aba8707e68f5c5ef94fcc7319e16f98"

RPROVIDES:${PN} += "libaugeas.so.0 \
libaugeas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfa.so.1 \
libxml2.so.2"

inherit rpm
