SUMMARY = "Javadoc for scala-maven-plugin"
DESCRIPTION = "This package contains javadoc for scala-maven-plugin."
LICENSE = "SUSE-Public-Domain"

PV = "3.4.6"

RPM_NAME = "scala-maven-plugin-javadoc-3.4.6-3.10.noarch.rpm"
RPM_HASH = "36324419cf10ceeb97b8f833979f118c4af265d712b017be30366ad721d1ebc2e595c9cd9ea97144d2c608bb2a75f5f658adf28ac876c9dc4baf50aa5ac38fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
