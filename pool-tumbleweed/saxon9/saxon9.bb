SUMMARY = "The SAXON XSLT Processor from Michael Kay"
DESCRIPTION = "The most recent version of the open-source implementation of XSLT 2.0 and XPath \
2.0, and XQuery 1.0. This provides the 'basic' conformance level of these \
languages: in effect, this provides all the features of the languages except \
schema-aware processing. This version reflects the syntax of the final XSLT \
2.0, XQuery 1.0, and XPath 2.0 Recommendations of 23 January 2007 as amended in \
the second editions of those specifications where appropriate."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-9.4.0.7-16.6.noarch.rpm"
RPM_HASH = "15cd57b401171c7f56c0a0d8eda903adea178d4397969c383ca2451de3923a18d16281b73182ecfb9f949f603a8dbbff4e0cb42b255d6f14198701e3cba10bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxp-transform-impl \
mvn-net.sf.saxon-saxon \
mvn-net.sf.saxon-saxon-pom- \
saxon9 \
saxon9-dom \
saxon9-jdom \
saxon9-sql \
saxon9-xom \
saxon9-xpath"

RDEPENDS:${PN} += "/usr/bin/sh \
bea-stax \
bea-stax-api \
java-headless \
javapackages-filesystem"

inherit rpm
