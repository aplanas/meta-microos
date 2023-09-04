SUMMARY = "Java standard interface for CSS parser"
DESCRIPTION = "SAC is a standard interface for CSS parsers, intended to work with CSS1, CSS2, \
CSS3 and other CSS derived languages."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-1.3-12.1.noarch.rpm"
RPM_HASH = "12a35e81be1548c36cb1e2e50678483423c2307bfca2f04625894b725f800df452b1fb56ba9d524981c0dca32eb875f5ead6aae197baf422caf2c2fbd7549ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.w3c.css-sac \
mvn-org.w3c.css-sac-pom- \
osgi-org.w3c.css.sac \
sac"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
