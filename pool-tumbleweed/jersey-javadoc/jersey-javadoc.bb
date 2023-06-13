SUMMARY = "Javadoc for jersey"
DESCRIPTION = "This package contains javadoc for jersey."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "2.28"

RPM_NAME = "jersey-javadoc-2.28-6.10.noarch.rpm"
RPM_HASH = "444b5adaec383cdae91116bae3d47b1bdbc76e264682954f7124d5ec1a61f14f31931b00682a423e2feb9c35cebcd6fbd7a7e42d1a7d3c3153d97b05ca882d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jersey-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
