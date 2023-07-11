SUMMARY = "Full regular expressions API"
DESCRIPTION = "The Jakarta-ORO Java classes are a set of text-processing Java classes \
that provide Perl5 compatible regular expressions, AWK-like regular \
expressions, glob expressions, and utility classes for performing \
substitutions, splits, filtering filenames, etc. This library is the \
successor to the OROMatcher, AwkTools, PerlTools, and TextTools \
libraries from ORO, Inc. (www.oroinc.com). They have been donated to \
the Jakarta Project by Daniel Savarese (www.savarese.org), the \
copyright holder of the ORO libraries. Daniel will continue to \
participate in their development under the Jakarta Project."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "oro-2.0.8-297.7.noarch.rpm"
RPM_HASH = "849093cee98311cfa2dd8e97631c99e8a8689d56df13f010a7e8c9b5d1780a98e417c48b8f4a3bf7a155d908214f4973df8a0aa987f76e5c042831abc1905eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-oro \
mvn-oro-oro \
mvn-oro-oro-pom- \
oro"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
