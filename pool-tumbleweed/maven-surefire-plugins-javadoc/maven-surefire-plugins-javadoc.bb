SUMMARY = "Javadoc for maven-surefire-plugins"
DESCRIPTION = "Javadoc for maven-surefire-plugins."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-plugins-javadoc-2.22.0-8.2.noarch.rpm"
RPM_HASH = "c7b5ae39eaad77104edeac7d8795f8cbd564ce3e6471a8a37e00725515c3a34a8716cfbbe3a9fc76e3e5e7d4885ec45d176d19b21e9b8e6672cf3ea0307c410c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
