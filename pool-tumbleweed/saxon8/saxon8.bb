SUMMARY = "Java Basic XPath 2.0, XSLT 2.0, and XQuery 1.0 implementation"
DESCRIPTION = "Release 8.6 represents an important milestone in Saxonica's progressive \
implementation of the XPath 2.0, XSLT 2.0, and XQuery 1.0 \
specifications. Saxon 8.6 is aligned with the W3C Candidate \
Recommendation published on 3 November 2005. It is a complete and \
conformant implementation, providing all the mandatory features of \
those specifications and nearly all the optional features. Saxon is \
available in two versions. Saxon-B is a non-schema-aware processor, and \
is available as an open-source product, free of charge, from \
SourceForge. It is designed to conform to the basic conformance level \
of XSLT 2.0, and the equivalent level of functionality in XQuery 1.0. \
Saxon-SA is the schema-aware version of the package, and is available \
as a commercially supported product from Saxonica Limited. \
 \
This package provides the Basic XSLT 2.0 and XQuery 1.0 processor. \
Includes the command line interfaces and the JAVA APIs; also includes a \
standalone XPath API that doesn't depend on JAXP 1.3."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-B.8.8-133.7.noarch.rpm"
RPM_HASH = "cac4f095a77bd8fdcb9fed238ea4ca739917205959027d902212a901ca9021f40cb2ff2978e38b4635d41c0551667af5f754150e7a2dcfba3eeedf113d242d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxp-transform-impl \
saxon8"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
bea-stax \
bea-stax-api \
jaxp-parser-impl"

inherit rpm
