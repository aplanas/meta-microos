SUMMARY = "Shared EPL v1.0 license feature for Eclipse"
DESCRIPTION = "Shared license feature for Eclipse. Other features may consume this \
feature to avoid unnecessary duplication of license boiler plate."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "eclipse-license1-1.0.1-5.6.noarch.rpm"
RPM_HASH = "11dd2d423e689fdf4cc9b20d2e1a28d2a673926f70ffaf056b48ec2602309e247dad07f822ac7121c68ab28f2c2d300b77c5be606e30d4c5aa19f388c1d7da47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-license \
eclipse-license1 \
mvn-org.eclipse.license-org.eclipse.license \
osgi-org.eclipse.license"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
