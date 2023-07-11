SUMMARY = "Simple regular expressions API"
DESCRIPTION = "Regexp is a 100% Pure Java Regular Expression package that was \
graciously donated to the Apache Software Foundation by Jonathan Locke. \
He originally wrote this software back in 1996 and it has stood up \
quite well to the test of time. It includes complete Javadoc \
documentation as well as a simple Applet for visual debugging and \
testing suite for compatibility."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "regexp-1.5-23.7.noarch.rpm"
RPM_HASH = "a3749999731ab851449b4eac68350e7d64555a29aa498c64e5590c99d8105b933459899d7fd8e6094821a98bce50f7a90dcb9199bbaf616186fe46621660bbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-jakarta-regexp-jakarta-regexp \
mvn-jakarta-regexp-jakarta-regexp-pom- \
mvn-regexp-regexp \
mvn-regexp-regexp-pom- \
regexp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
