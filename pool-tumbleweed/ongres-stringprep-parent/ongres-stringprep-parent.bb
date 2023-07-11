SUMMARY = "Developement files for ongres-stringprep"
DESCRIPTION = "This package contains development files for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-parent-1.1-1.11.noarch.rpm"
RPM_HASH = "ca57aa1f6a229eabb761162a1a317066ec02876b5eeed7c65a2ac154cdaaac9e1c86bdb4c1b7c53070609f33bc219c8d3d8e2701d471b93f4be8fe1695cc8ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.stringprep-parent-pom- \
ongres-stringprep-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin"

inherit rpm
