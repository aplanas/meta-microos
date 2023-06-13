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

RPM_NAME = "oro-2.0.8-297.6.noarch.rpm"
RPM_HASH = "36b26084acb56ca891d380a4976bc3eb1a82d2f1b92ceadb62f36fd86ab8ea9169a4de48e12b4e153e1f30c1bfb2032d33fd0228cfc40cc82542509e5a87c418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-oro \
mvn(oro:oro) \
mvn(oro:oro:pom:) \
oro"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
