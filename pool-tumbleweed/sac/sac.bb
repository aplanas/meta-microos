SUMMARY = "Java standard interface for CSS parser"
DESCRIPTION = "SAC is a standard interface for CSS parsers, intended to work with CSS1, CSS2, \
CSS3 and other CSS derived languages."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-1.3-11.6.noarch.rpm"
RPM_HASH = "f05e8b209a1288b60a2ade40f176d82752984d225f0c9d8856adb8387504cb210d87616b000da0f9f197baa7fc07726e6bed627ed304cac7f1f0dcc508417677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.w3c.css-sac \
mvn-org.w3c.css-sac-pom- \
osgi-org.w3c.css.sac \
sac"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
