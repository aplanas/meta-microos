SUMMARY = "Sisu inject"
DESCRIPTION = "This package contains Sisu inject."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-inject-0.3.5-3.6.noarch.rpm"
RPM_HASH = "d4dea4e1779b0cf1f2031328d6e34fa399607fe9886bf5a3dde63849e4cbd05bd199d66bca8ef42f0baee4354f0d12b36eb3e3005224881d1bfeb53f172da0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject-pom- \
sisu-inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.enterprise-cdi-api"

inherit rpm
