SUMMARY = "W3C XML schema to C++ data binding compiler"
DESCRIPTION = "CodeSynthesis XSD is an open-source, cross-platform W3C XML Schema to \
C++ data binding compiler. Provided with an XML instance specification \
(XML Schema), it generates C++ classes that represent the given \
vocabulary as well as parsing and serialization code. \
You can then access the data stored in XML using types and functions \
that semantically correspond to your application domain rather than \
dealing with intricacies of reading and writing XML."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "4.1.0"

RPM_NAME = "xsd-4.1.0-1.15.aarch64.rpm"
RPM_HASH = "4bccae502527d309bd53909a3befc9326631a6900b7452a59704de010f8039fb8fe32dc79a5be5bddc8d95e803fedaad4ff8fe4feeb61d26860ed7336e6aec07"

RPROVIDES:${PN} += "xsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxerces-c-devel"

inherit rpm
