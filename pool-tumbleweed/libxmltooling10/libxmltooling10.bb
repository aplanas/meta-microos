SUMMARY = "OpenSAML XMLTooling library"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.2.3"

RPM_NAME = "libxmltooling10-3.2.3-1.4.aarch64.rpm"
RPM_HASH = "1d80e0889fe6e75ea7405ad88f23296312567ad626f35b61be2f8036ca4f5d71d17360051791d7b338f105d12bfc60c725d357879e3c10d68a9080011f140b4a"

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
