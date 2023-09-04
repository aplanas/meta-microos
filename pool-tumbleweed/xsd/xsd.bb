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

RPM_NAME = "xsd-4.1.0-2.1.aarch64.rpm"
RPM_HASH = "19b22a0189a50ea55b7b83b527fc738ca76bdfdc48ef950714832fbc5fda237c66119e07df7d226fde8ef19347c6909d0264246cfa26f795fa27cdeadb140526"

RPROVIDES:${PN} += "xsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxerces-c-devel"

inherit rpm
